package com.example.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.server.entity.TicketDetail;

public interface TicketDetailsRepo extends JpaRepository<TicketDetail, Integer>{

}
