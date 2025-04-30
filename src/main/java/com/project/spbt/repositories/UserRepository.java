package com.project.spbt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.spbt.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
