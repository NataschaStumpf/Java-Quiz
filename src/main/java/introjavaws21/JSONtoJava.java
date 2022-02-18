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

public class JSONtoJava {

    public static void main(String[] args){

            ObjectMapper objectMapper = new ObjectMapper();

            try {
                Quiz quiz = objectMapper.readValue(new URL("file: src/main/java/introjavaws21/quiz-example.json"), Quiz.class);
                System.out.println(quiz);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
