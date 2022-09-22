package com.h2dbtest.h2dbtest.controller;

import com.h2dbtest.h2dbtest.model.User;
import com.h2dbtest.h2dbtest.repository.UserRepository;
import com.h2dbtest.h2dbtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("HelloRestController")
@RequestMapping("/api/hello")
public class HelloRestController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public String hello(){
        return "hello";
    }

    @GetMapping("/user")
    public User userWho(@RequestParam() long id){
        return userService.findUserById(id);
    }

    @GetMapping("/user/all")
    public List<User> userAll(){
        return userService.findAll();
    }
}
