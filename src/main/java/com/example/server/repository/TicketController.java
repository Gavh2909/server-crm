package com.example.server.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.server.Request.NewTicketRequest;
import com.example.server.service.TicketDetailService;

@RestController
@RequestMapping("/api")
public class TicketController {
    @Autowired
	public TicketDetailService ticketService;
	
	@PostMapping("/new")
	private ResponseEntity<String> newTicker( @RequestBody NewTicketRequest request ){
		return ticketService.registerTicket(request);
	}
}
