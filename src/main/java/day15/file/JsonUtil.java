package day15.file;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonUtil {
    ObjectMapper objectMapper = new ObjectMapper();

    public String toJsonString(Post p1) {
        try {
            // 객체를 JSON으로 직렬화
            String jsonString = objectMapper.writeValueAsString(p1);
            return jsonString;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String toJsonString2(Member m1) {
        try {
            // 객체를 JSON으로 직렬화
            String jsonString2 = objectMapper.writeValueAsString(m1);
            return jsonString2;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // JSON을 객체로 역직렬화
    public <T> T fromJsonString(String jsonString, Class<T> tClass) {
            try {
                return objectMapper.readValue(jsonString, tClass);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                return null;
            }
    }

}
