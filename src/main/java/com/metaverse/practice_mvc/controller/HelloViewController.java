package com.metaverse.practice_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloViewController {
    @GetMapping("/static-hello")
    public String hello(){
        return "hello.html";
    }

    @GetMapping("/html/redirect")
    public String htmlRedirect(){
        return "redirect:/hello.html";
    }

    @GetMapping("/html/templates")
    public String htmlTemplates(){
        //...내부 연상 추가 가능.
        return "hello-template";
    }
}
