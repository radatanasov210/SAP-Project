package com.demo.repository;

import com.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Repository ни дава обикновена функционалност с операциите CRUD, без да сме ги дефинирали.
    // Затова тук няма нищо.
    Optional<User> findByFirstName(String firstName);
    Optional<User> findById(Long id);
}
