package com.minh.dev.service;

import com.minh.dev.entity.User;
import com.minh.dev.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createRequest(Object request) {

    }
}
