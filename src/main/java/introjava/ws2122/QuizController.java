package introjava.ws2122;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController marks the class as a controller where every method returns a domain object
// instead of a view. It is shorthand for including both @Controller and @ResponseBody
@RestController
public class QuizController {

    private QuizService quizService = QuizApplication.quizService;

     // @GetMapping ensures that HTTP GET requests to /greeting are mapped to the greeting() method
    @GetMapping("/startQuiz")
    public QuizQuestion startQuiz(){
        Quiz quiz = quizService.createNewQuiz(2, "java");
        // return first quiz question(quizId, questionId, text, possible answers)
        return quiz.getNextQuestion();
    }

    @GetMapping("/answer")
    public AnswerResult answer(int quizId, int questionId, Question answer){
        Quiz quiz = quizService.getQuizById(quizId);; //update database json
        Question question = quiz.getQuestion(questionId);

        boolean result = question.getAnswer().equals(answer);
        quizService.safe(quizId, questionId, result, answer);
        return new AnswerResult(quizId, questionId, result, question.getAnswer());
    }

    @GetMapping("/nextQuestion")
    public QuizQuestion next(int quizId){
        Quiz quiz = quizService.getQuizById(quizId);
        return quiz.getNextQuestion();
    }

    @GetMapping("/quizScore")
    public QuizScore quizScore(int quizId){
        Quiz quiz = quizService.getQuizById(quizId);
        return quiz.getScore();
    }
}
