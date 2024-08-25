package com.howard.backend.service;

import com.howard.backend.model.User;

import java.util.Optional;

public interface UserService {
    User registerUser(User user);
    String loginUser(String username, String password); // 修改了返回類型為 String
    Optional<User> getUserById(Long id);
}
