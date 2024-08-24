package com.howard.backend.service;

import com.howard.backend.model.User;

import java.util.Optional;

public interface UserService {
    User registerUser(User user);
    Optional<User> loginUser(String username, String password);
    Optional<User> getUserById(Long id);
}
