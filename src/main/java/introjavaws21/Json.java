package introjavaws21;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Json {

    // ObjectMapper from Jackson
    private static ObjectMapper objectMapper = getDefaultObjectMapper();

    // create private method to return ObjectMapper
    private static ObjectMapper getDefaultObjectMapper() {
        ObjectMapper defaultObjectMapper = new ObjectMapper();

        return defaultObjectMapper;
    }

    // parse a JSON String into a JSON node
    public static JsonNode parse(String src) throws IOException {

        // readTree is going to return Json node
        return objectMapper.readTree(src);
    }
}
