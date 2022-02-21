package introjavaws21;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;

public class JSONtoJava {

    public static void main(String[] args) throws MalformedURLException {

        ObjectMapper objectMapper = new ObjectMapper();
        Path path = Path.of("src/main/java/introjavaws21/quiz-questions.json");
        // Path path = Path.of("src/main/java/introjavaws21/quiz-questions.json");
        
        try {
            Quiz quiz = objectMapper.readValue(path.toUri().toURL(), Quiz.class);
            System.out.println(quiz);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
