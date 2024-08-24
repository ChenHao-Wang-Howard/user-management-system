package com.howard.backend;

import com.howard.backend.model.User;
import com.howard.backend.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testCreateUser() {
         User user = new User("uuu", "ppp", "uuu@example.com");
         userRepository.save(user);

        Optional<User> found = userRepository.findByUsername("testuser");
        assertThat(found).isNotNull();
        assertThat(found.get().getEmail()).isEqualTo("testuser@example.com");
    }
}
