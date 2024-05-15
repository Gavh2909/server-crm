package com.example.server.service;

import org.springframework.http.ResponseEntity;

import com.example.server.Request.NewTicketRequest;


public interface TicketDetailService {
    public ResponseEntity<String> registerTicket(NewTicketRequest request);
}
