package com.example.server.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class TicketDetail {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ticketNumber;
	
	private Integer comsumerNumber;
	
	private String date;
	
	private String subject;
	
	private String description;
	
	private String currentStatus= "new";
	
	private List<String> comments;

	public Integer getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(Integer ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public Integer getComsumerNumber() {
		return comsumerNumber;
	}

	public void setComsumerNumber(Integer comsumerNumber) {
		this.comsumerNumber = comsumerNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}
	
	
	
}
