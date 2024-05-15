package com.example.server.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.server.Request.NewTicketRequest;
import com.example.server.entity.Consumer;
import com.example.server.entity.TicketDetail;
import com.example.server.repository.TicketDetailsRepo;
@Service
public class TicketDetailsServiceImpl implements TicketDetailService {
	
	@Autowired
	private TicketDetailsRepo ticketDetailsRepo;
	
     public ResponseEntity<String> registerTicket(NewTicketRequest request){
    	 String res = "ticker submitted";
    	 
    	 TicketDetail ticketDetail = new TicketDetail();
    	 Consumer consumer = new Consumer();
    	 
    	 BeanUtils.copyProperties(request, ticketDetail);
    	 
    	 ticketDetailsRepo.save(ticketDetail);
    	 
    	 return new ResponseEntity<>(res, HttpStatus.OK);
     }
}
