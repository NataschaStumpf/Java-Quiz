package introjavaws21;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController marks the class as a controller where every method returns a domain object
// instead of a view. It is shorthand for including both @Controller and @ResponseBody
@RestController
public class QuizController {

    private QuizService quizService = QuizApplication.quizService;

     // @GetMapping ensures that HTTP GET requests to /greeting are mapped to the greeting() method
    @GetMapping("/startquiz")
    public String startQuiz(){
        Quiz quiz = quizService.createNewQuiz(5, "java"); //
        return "hallo"; // return first quiz question(quizId, questionId, text, possible aswers)
    }

    @GetMapping("/answer")
    public String answer(int quizid, String questionid, String answer){
    Quiz quiz = quizService.getQuizId(quizid); //update database json
    Questions question = quiz.getQuestions(questionsID); //return next question

    // check answer and remember it
    // quizService.safe(quizId, questionId, answer)

     return quiz.nextQuestion();
    }

    @GetMapping("/nextquestion")
    public String next(int quizid){
        Quiz quiz = quizService.getQuizId(quizid);
        return quiz.getNextQuestion();
    }
}
