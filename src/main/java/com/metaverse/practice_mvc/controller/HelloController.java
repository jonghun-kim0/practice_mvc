package com.metaverse.practice_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("api/hello")
    @ResponseBody
    public String hello() {
        return "hello world.";
    }

    @GetMapping("api/get")
    @ResponseBody
    public String get(){
        return "Get method 요청.";
    }

    @GetMapping("api/post")
    @ResponseBody
    public String post(){
        return "Post method 요청.";
    }
}
