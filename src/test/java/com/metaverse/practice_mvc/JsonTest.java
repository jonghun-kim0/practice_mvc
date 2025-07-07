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
}
