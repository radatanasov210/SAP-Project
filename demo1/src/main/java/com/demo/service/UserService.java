package com.demo.service;

import com.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);

    User saveUser(User user);

    User updateUserById(Long id, User newUserData);

    void deleteUserById(Long id);
}
