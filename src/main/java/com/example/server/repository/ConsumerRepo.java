package com.example.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.server.entity.Consumer;

public interface ConsumerRepo extends JpaRepository<Consumer, Integer> {
    
}
