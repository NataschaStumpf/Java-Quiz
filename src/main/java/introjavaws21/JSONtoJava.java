package introjavaws21;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import org.springframework.boot.json.JsonParseException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;

public class JSONtoJava {

    public static void main(String[] args) throws MalformedURLException {

        ObjectMapper objectMapper = new ObjectMapper();
        Path path = Path.of("src/main/java/introjavaws21/quiz-example.json");
        // Path path = Path.of("src/main/java/introjavaws21/test.json");
        
        try {
            Quiz quiz = objectMapper.readValue(path.toUri().toURL(), Quiz.class);
            System.out.println(quiz);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
