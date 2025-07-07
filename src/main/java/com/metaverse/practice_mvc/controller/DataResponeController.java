package com.metaverse.practice_mvc.controller;
import com.metaverse.practice_mvc.domain.Star;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataResponeController {
    @GetMapping("response/json/string")
    public String helloStringJson(){
        return "{\"name\" : \"Meta\", \"age\" = 95 }";
    }

    @GetMapping("response/json/instance")
    public Star helloInstanceJson(){
        //Star star = new Star();
        return new Star("Meta",88);

    }
}
