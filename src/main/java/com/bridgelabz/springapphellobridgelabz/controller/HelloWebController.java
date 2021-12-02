package com.bridgelabz.springapphellobridgelabz.controller;

import com.bridgelabz.springapphellobridgelabz.dto.EmployeeDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Purpose : Demonstrate different REST API Calls
 *
 * @author : Ramkrishna Sheral
 * @version : 0.0.1
 * @since : 01-12-2021
 */
@RestController
public class HelloWebController {

    /**
     * Purpose : GET Request method is used to get greeting hello message from BridgeLabz
     *
     * @return Hello from Bridgelabz message
     */
    @GetMapping("/")
    public String hello() {
        return "Hello from Bridgelabz";
    }
    /**
     * Purpose : GET Request method is used to get greeting hello message from BridgeLabz
     *
     * @return Hello Mark from Bridgelabz message
     */
    @GetMapping(value = "/name")
    public String name(
            @RequestParam(name = "key1") String name
    ) {
        return "Hello " + name + " from Bridgelabz";
    }
    /**
     * Purpose : GET Request method is used to get greeting hello message from BridgeLabz
     *
     * @return Hello Mark from Bridgelabz message
     */
    @GetMapping("/test1/{id}")
    public String test1(
            @PathVariable(name = "id") String id
    ) {
        return "Hello " + id + " from Bridgelabz";
    }
    /**
     * Purpose : POST Request method is used to get greeting hello message from BridgeLabz
     *
     * @return Hello Mark Taylor from Bridgelabz message
     */
    @PostMapping(value = "test2")
    public String test2(
            @RequestBody  List<EmployeeDto> employeeDtoList
            ){
            return employeeDtoList.toString();
    }
    /**
     * Purpose : PUT Request method is used to get greeting hello message from BridgeLabz
     *
     * @return Hello Mark Taylor from Bridgelabz message
     */
    @PutMapping("/put/{firstname}")
    public String test3(@PathVariable String firstname, @RequestParam String lastname){
        return "Hello "+firstname+" "+lastname + " from Bridgelabz";
    }
}
