package com.example.thymeleaf1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class DemoController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
