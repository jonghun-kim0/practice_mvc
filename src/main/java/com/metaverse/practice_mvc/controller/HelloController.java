package com.metaverse.practice_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api")
public class HelloController { //prefix

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello world.";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get(){
        return "Get method 요청.";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post(){
        return "Post method 요청.";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put(){
        return "Put method 요청.";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete(){
        return "Delete method 요청.";
    }
}
