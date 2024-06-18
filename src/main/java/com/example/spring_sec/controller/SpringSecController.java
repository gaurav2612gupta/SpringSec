package com.example.spring_sec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecController {
    @GetMapping("hello")
    public String hello() {
        return "Hello World";
    }
}
