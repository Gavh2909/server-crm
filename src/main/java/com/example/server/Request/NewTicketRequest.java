package com.example.server.Request;

public class NewTicketRequest {
	
	private Integer comsumerNumber;
	
	
	private String subject;
	
	private String description;

	public Integer getComsumerNumber() {
		return comsumerNumber;
	}

	public void setComsumerNumber(Integer comsumerNumber) {
		this.comsumerNumber = comsumerNumber;
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
	
	
}
