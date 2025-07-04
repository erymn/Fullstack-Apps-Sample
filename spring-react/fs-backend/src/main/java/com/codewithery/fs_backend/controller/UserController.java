package com.codewithery.fs_backend.controller;

import com.codewithery.fs_backend.model.User;
import com.codewithery.fs_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    // inject UserRepository ke Controller, pakai attribut autowired
    @Autowired
    private UserRepository userRepository;

    //posting the data pakai @PostMapping, di .net pakai route HttpPost
    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

}
