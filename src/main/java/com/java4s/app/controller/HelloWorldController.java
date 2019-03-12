package com.java4s.app.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@EnableAutoConfiguration
public class HelloWorldController {
 
    @RequestMapping("/hello")
    @ResponseBody
    String hello() {
        return "Hello World! Spring boot is so simple.";
    }
}