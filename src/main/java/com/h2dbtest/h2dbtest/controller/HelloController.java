package com.h2dbtest.h2dbtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("HelloController")
@RequestMapping("/")
public class HelloController {

    @GetMapping("")
    public String hello(){
        return "hello";
    }
}
