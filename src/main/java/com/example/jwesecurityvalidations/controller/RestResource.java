package com.example.jwesecurityvalidations.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestResource {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
