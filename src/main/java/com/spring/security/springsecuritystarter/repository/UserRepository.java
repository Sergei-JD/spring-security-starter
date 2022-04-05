package com.spring.security.springsecuritystarter.repository;

import com.spring.security.springsecuritystarter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}
