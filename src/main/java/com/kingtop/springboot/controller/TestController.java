package com.kingtop.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String helloworld() {
        return "Can You Feeling It?";
    }
    
    @GetMapping("/helloworld2")
    public String helloworld2() {
        return "helloworld2";
    }
}
