package com.klef.jfsd.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.entity.User;
import com.klef.jfsd.springboot.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Save a new user
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    // Find user by username for login
    public Optional<User> findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
