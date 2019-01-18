package com.taojintianxia.springboothelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nianjun Sun
 * @date 2018/12/12 15:40
 */

@RestController()
public class HelloWorldController {

    @GetMapping("hello")
    public String helloWorld() {
        System.out.println("Hello World");
        return "Hello, World !";
    }
}

