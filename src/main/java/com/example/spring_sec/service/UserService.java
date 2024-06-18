package com.example.spring_sec.service;

import com.example.spring_sec.dao.UserRepo;
import com.example.spring_sec.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public User saveUser(User user) {
        return repo.save(user);
    }
}