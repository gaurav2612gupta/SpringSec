package com.example.spring_sec.controller;

import com.example.spring_sec.model.User;
import com.example.spring_sec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    public User addUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
