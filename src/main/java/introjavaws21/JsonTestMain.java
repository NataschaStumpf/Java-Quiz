package introjavaws21;

import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

public class JsonTestMain {

    // create main method
    public static void main(String[] args){

        // define JSON
        String jsonSource = "{ \"title\" : \"Coder From Scratch\" }";

        // surround with try catch
        try {
            // parse JsonNode
            JsonNode node = Json.parse(jsonSource);

            // access attribute title using the get
            // read attribute as text
            System.out.println(node.get("title").asText());

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
