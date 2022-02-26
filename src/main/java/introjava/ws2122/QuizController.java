package introjava.ws2122;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

// @RestController marks the class as a controller where every method returns a domain object
// instead of a view. It is shorthand for including both @Controller and @ResponseBody
@RestController
public class QuizController {

    private QuizService quizService = QuizApplication.quizService;

     // @GetMapping ensures that HTTP GET requests to /greeting are mapped to the greeting() method
    @GetMapping("/startQuiz")
    public QuizQuestion startQuiz() throws IOException {
        Quiz quiz = quizService.createNewQuiz(2, "java");
        // return first quiz question(quizId, questionId, text, possible answers)
        Question question = quiz.getNextQuestion();
        return new QuizQuestion(quiz.getQuizId(), question.getQuestion(), question.getChoices());
    }

    // @RequestParam(value = "name", defaultValue = "World") String name
    @GetMapping("/answer")
    public AnswerResult answer(int quizId, String answer) throws IOException {
        Quiz quiz = quizService.getQuizById(quizId);; //update database json
        Question question = quiz.getNextQuestion();
        // boolean true/false
        boolean result = question.getAnswer().equals(answer);
        quizService.safe(quizId, result, answer);
        // richtige Antwort anzeigen lassen
        return new AnswerResult(quizId, question.getId(), result, question.getAnswer());
    }

    @GetMapping("/nextQuestion")
    public QuizQuestion next(int quizId){
        Quiz quiz = quizService.getQuizById(quizId);
        Question question = quiz.getNextQuestion();
        return new QuizQuestion(quizId, question.getQuestion(), question.getChoices());
    }

    @GetMapping("/quizScore")
    public QuizScore quizScore(int quizId){
        Quiz quiz = quizService.getQuizById(quizId);
        return quiz.getScore();
    }
}
