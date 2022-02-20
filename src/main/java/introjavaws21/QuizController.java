package introjavaws21;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController marks the class as a controller where every method returns a domain object
// instead of a view. It is shorthand for including both @Controller and @ResponseBody
@RestController
public class QuizController {

    private final Questions questions;

    public QuizController(Questions questions) {
        this.questions = questions;
    }

    // @GetMapping ensures that HTTP GET requests to /greeting are mapped to the greeting() method
    @GetMapping("/startquiz")
    public String startQuiz(){
        return "hallo";
    }

    @GetMapping("/answer")
    public String startQuiz(int quizid, String questionid, String answer){
    Quiz quiz = QuizService.get(quizid); //update database json
    right = quiz.getQuestions(questionsID); //return next question
    answer == right;
    // save answer and score back to database
    return "score: ";
    }

    public Questions questions(){
        return QuizApplication.questions.get("java", 1);
  }
}
