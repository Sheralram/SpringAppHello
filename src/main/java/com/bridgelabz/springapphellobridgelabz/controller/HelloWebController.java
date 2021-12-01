package com.bridgelabz.springapphellobridgelabz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Bridgelabz";
    }

    @GetMapping(value = "/name")
    public String name(
            @RequestParam(name = "key1") String name
    ) {
        return "Hello " + name + " from Bridgelabz";
    }

    @GetMapping("/test1/{id}")
    public String test1(
            @PathVariable(name = "id") String id
    ) {
        return "Hello " + id + " from Bridgelabz";
    }
}
