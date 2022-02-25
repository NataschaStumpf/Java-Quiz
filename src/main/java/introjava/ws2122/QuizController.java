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
    public String startQuiz(){
        Quiz quiz = quizService.createNewQuiz(2, "java");
        // return first quiz question(quizId, questionId, text, possible answers)
        return quizId;
        return questionId;
        return choices;
    }

    @GetMapping("/answer")
    public String answer(int quizId, String questionId, Questions answer){
        Quiz quiz = quizService.getQuizId(quizId);; //update database json
        Questions questions = quiz.getQuestions(questionId);
        Questions answer = quiz.getAnswer;

        String givenAnswer = "";
        String rightAnswer = new String("");

        if(givenAnswer.equals(rightAnswer)){
            System.out.println("The answer is correct");
        }
        else {
            System.out.println("The answer is wrong");
        }

        quizService.Safe(quizId, questionId, answer);
        return givenAnswer;
        return rightAnswer;
    }


    @GetMapping("/nextQuestion")
    public String next(int quizId){
        Quiz quiz = quizService.getQuizId(quizId);
        return (String) quiz.getNextQuestion();
    }

    @GetMapping("/quizScore")
    public int quizScore(int quizScore){
        Quiz quiz = quizService.QuizScore(quizzes);
        return quizScore;
    }
}
