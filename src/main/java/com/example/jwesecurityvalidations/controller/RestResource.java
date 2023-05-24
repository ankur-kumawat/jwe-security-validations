package com.example.jwesecurityvalidations.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RestResource {

    @GetMapping("/hello")
    public String hello() {
        log.info("Hello Basic Controller");
        return "hello";
    }
}
