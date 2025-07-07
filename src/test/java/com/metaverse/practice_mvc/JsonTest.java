package com.metaverse.practice_mvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.metaverse.practice_mvc.domain.Star;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JsonTest {

    @Test
    @DisplayName("Object to JSON : Get method 필요")
    void test() throws JsonProcessingException{
        Star star = new Star("meta",55);

        //Jackson 라이브러리의 ObjectMapper가 파싱 기능 수행.
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(star);
        System.out.println("Json result : " + jsonString);
    }

    @Test
    @DisplayName("JSON to Object : Get method 필요")
    void test2() throws JsonProcessingException{
        String json = "{\"name\" : \"NANA\" , \"age\" : 250}";

        ObjectMapper objectMapper = new ObjectMapper();
        //json의 문자열을 star 클라스에 맞추어 값을 읽고 변환.
        Star star = objectMapper.readValue(json,Star.class);
        System.out.println("name : " + star.getName());
        System.out.println("age : " + star.getAge());
    }
}
