package introjavaws21;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class JSONtoJava {

    public static void main(String a[]){

        ObjectMapper mapper = new ObjectMapper();
        try {
            Quiz usrQuiz = mapper.readValue(new URL("file: src/main/java/introjavaws21/quiz-example.json"), Quiz.class);
            System.out.println(usrQuiz);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
