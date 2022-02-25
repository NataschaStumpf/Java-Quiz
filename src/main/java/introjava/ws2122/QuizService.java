package introjava.ws2122;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.util.List;

// database
public class QuizService {

    private int quizId;
    private String questionId;
    public int getQuizId() { return this.quizId; }
    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public String getQuestionId() {
        return questionId;
    }
    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }


    public QuizService(int quizId, String questionId, Questions answer) {
        for (int i = 0; i < 2; i++);
    }

    public Quiz createNewQuiz(int i, String java) {
        return new Quiz();
    }

    private List<Questions> questions;

    private Path quizzes;

    public Path getQuizzes() { return quizzes;}
    public void setQuizzes(Path quizzes) {this.quizzes = quizzes;}

    public static void main(String[] args) throws MalformedURLException {

        ObjectMapper objectMapper = new ObjectMapper();
        Path path = Path.of("quiz-questions.json");
        Path quizzes = Path.of("history.json"); //?

        try {
            Quiz quiz = objectMapper.readValue(path.toUri().toURL(), Quiz.class);
            System.out.println(quiz);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public QuizService(Path path, Path quizzes) {
        // load questions, load quizzes
    }

    public void Safe(int quizId, String questionId, Questions answer) {
            this.quizId = quizId;
            this.questionId = questionId;
            this.answer = answer;
    }
    public Safe(int quizId, String questionId, Questions answer) {
        this(quizId, questionId, answer);
    }
    Safe safe = new Safe(quizzes);
    gson.toJson(safe, new FileWriter(Path quizzes));
}
