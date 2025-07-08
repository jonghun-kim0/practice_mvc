package com.metaverse.practice_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello/request")
public class DataRequestController {
    @GetMapping("form/html")
    public String form() {
        return "hello-request-form";
    }

    // Path value 방식 요청을 받는 방법. @PathVariable
    @GetMapping("/star/{name}/age/{age}")
    @ResponseBody
    public String helloRequestPath(@PathVariable String name, @PathVariable Integer age) {
        return String.format("Hello, @PathVariable로 받은 값들, <br> name = %s, age = %d",name,age);
    }

    //QueryString 방식 요청 받는 방법 @Requestparam
    @GetMapping("/form/param")
    @ResponseBody
    public String helloRequestParam(@RequestParam String name, @RequestParam Integer age) {
        return String.format("Hello, @PathVariable로 받은 값들, <br> name = %s, age = %d",name,age);
    }
}
