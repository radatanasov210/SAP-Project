package com.demo.service;

import com.demo.model.User;
import com.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // C
    // Save Users to the database
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // U
    // Get Users from the Database.
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }


    // U
    // Update User in the database
    public User updateUserById(Long id, User newUserData) {
        Optional<User> optionalUser = userRepository.findById(id);

        if (optionalUser.isPresent()) {
            User existingUser = optionalUser.get();

            if (newUserData.getFirstName() != null)
                existingUser.setFirstName(newUserData.getFirstName());

            if (newUserData.getLastName() != null)
                existingUser.setLastName(newUserData.getLastName());

            if (newUserData.getEmail() != null)
                existingUser.setEmail(newUserData.getEmail());

            return userRepository.save(existingUser);
        } else {
            throw new NoSuchElementException("User with ID "+ id + " was not found");
        }
    }

    // D
    // Delete User in the databse
    public void deleteUserById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);

        if (optionalUser.isPresent()) {
            userRepository.deleteById(id);
        } else {
            throw new NoSuchElementException("User with ID "+ id + " was not found!");
        }
    }
}
