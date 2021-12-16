package com.example.adosysspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {

    @GetMapping("/")
    public String gethelloWorld() {
        return "<h1>Hello World</h1>";
    }
}

