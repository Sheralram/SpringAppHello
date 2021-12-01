package com.bridgelabz.springapphellobridgelabz.controller;

import com.bridgelabz.springapphellobridgelabz.dto.EmployeeDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping(value = "test2")
    public String test2(
            @RequestBody  List<EmployeeDto> employeeDtoList
            ){
            return employeeDtoList.toString();
    }
}
