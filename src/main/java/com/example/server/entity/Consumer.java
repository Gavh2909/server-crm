package com.example.server.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Consumer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer consumerId;
	
	private String consumerName;
	
	private String email;
	
	private String meterId;
	
	private String state;
	
	private String city;
	
	private String subStation;

	public Integer getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(Integer consumerId) {
		this.consumerId = consumerId;
	}

	public String getConsumerName() {
		return consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMeterId() {
		return meterId;
	}

	public void setMeterId(String meterId) {
		this.meterId = meterId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSubStation() {
		return subStation;
	}

	public void setSubStation(String subStation) {
		this.subStation = subStation;
	}
	
	
}

