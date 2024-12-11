package com.klef.jfsd.springboot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springboot.entity.User;
import com.klef.jfsd.springboot.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    // Register user
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        // Perform registration logic (e.g., password hashing)
        User savedUser = userService.registerUser(user);
        return ResponseEntity.ok(savedUser);
    }

    // Login user
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        // Perform login logic, e.g., check credentials
        Optional<User> foundUser = userService.findUserByUsername(user.getUsername());
        if (foundUser.isPresent() && foundUser.get().getPassword().equals(user.getPassword())) {
            return ResponseEntity.ok("Login successful");
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
    }
}
