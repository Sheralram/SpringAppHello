package com.bridgelabz.springapphellobridgelabz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Bridgelabz";
    }
}
