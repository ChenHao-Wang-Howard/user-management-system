package com.howard.backend.controller;

import com.howard.backend.dto.JwtResponse;
import com.howard.backend.model.User;
import com.howard.backend.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@Valid @RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User user) {
        // 調用 userService 的 loginUser 方法，這個方法現在返回 JwtResponse
        JwtResponse jwt = userService.loginUser(user.getUsername(), user.getPassword());
        return ResponseEntity.ok(jwt);
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/profile/{id}")
    public String getUserEmail(@PathVariable Long id) {
        Optional<User> user = userService.getUserById(id);
        return user.isPresent() ? user.get().getEmail() : null;
    }
}
