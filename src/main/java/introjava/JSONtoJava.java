package introjava;

import com.fasterxml.jackson.databind.ObjectMapper;
import introjava.ws2122.Quiz;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;

public class JSONtoJava {

    public static void main(String[] args) throws MalformedURLException {

        ObjectMapper objectMapperTest = new ObjectMapper();
        Path pathTest = Path.of("quiz-questions.json");
        
        try {
            Quiz quiz = objectMapperTest.readValue(pathTest.toUri().toURL(), Quiz.class);
            System.out.println(quiz);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
