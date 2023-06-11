package com.userRegistration.repositoris;

import com.userRegistration.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // You can add custom query methods or use the default methods provided by JpaRepository
    // For example:
    // User findByEmail(String email);
}

