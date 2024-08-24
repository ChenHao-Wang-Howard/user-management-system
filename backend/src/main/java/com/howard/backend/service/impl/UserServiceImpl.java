package com.howard.backend.service.impl;

import com.howard.backend.model.User;
import com.howard.backend.repository.UserRepository;
import com.howard.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User registerUser(User user) {
        // 檢查欄位是否為空
        if (!StringUtils.hasText(user.getUsername()) || !StringUtils.hasText(user.getPassword()) || !StringUtils.hasText(user.getEmail())) {
            throw new IllegalArgumentException("所有欄位都是必填的");
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public Optional<User> loginUser(String username, String password) {
        Optional<User> optionalUser = userRepository.findByUsername(username);
        if (optionalUser.isPresent()) {
            User user_find = optionalUser.get();
            if (passwordEncoder.matches(password, user_find.getPassword())) {
                return optionalUser;
            }
        }
        return Optional.empty();
    }
    @Override
    public Optional<User> getUserById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);

        if (optionalUser.isPresent()) {
            return optionalUser;
        }
        return Optional.empty();
    }
}
