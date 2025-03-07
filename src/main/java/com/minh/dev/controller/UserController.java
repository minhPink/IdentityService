package com.minh.dev.controller;

import com.minh.dev.dto.request.UserCreationRequest;
import com.minh.dev.entity.User;
import com.minh.dev.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    User createUser(@RequestBody UserCreationRequest request) {
        return userService.createUser(request);
    }
}
