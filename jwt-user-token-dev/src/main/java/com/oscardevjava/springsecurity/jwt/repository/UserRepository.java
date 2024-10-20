package com.oscardevjava.springsecurity.jwt.repository;

import com.oscardevjava.springsecurity.jwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    @Override
    Optional<User> findById(String username);
    Optional<User> findByUsername(String username);
}
