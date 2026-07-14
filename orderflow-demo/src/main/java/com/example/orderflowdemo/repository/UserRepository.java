package com.example.orderflowdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.orderflowdemo.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

    
}
