package com.metaverse.practice_mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloViewController {
    private static long visitCount = 0;

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
        //...내부 로직 추가 가능.
        //prefix classpath: .resources까지의 경로 + templates/까지 가지고 있음.
        //suffix .html
        return "hello-template";
    }

    @GetMapping("/html/dynamic")
    public String htmlDynamic(Model model){
        visitCount++;
        model.addAttribute("visits", visitCount);
        return "hello-dynamic";
    }
}
