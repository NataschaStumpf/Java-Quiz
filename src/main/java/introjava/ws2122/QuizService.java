package introjava.ws2122;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.util.List;

// database
public class QuizService {

    public static void main(String[] args) throws MalformedURLException {

        ObjectMapper objectMapper = new ObjectMapper();
        Path path = Path.of("quiz-questions.json");

        try {
            Quiz quiz = objectMapper.readValue(path.toUri().toURL(), Quiz.class);
            System.out.println(quiz);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Questions> questions;

    private xxx quizes;

    public QuizService(Path path, Path quizes) {
        //  load questions
        // load quizes
    }

    public Quiz getQuizId(int quizid) {
    }
}
