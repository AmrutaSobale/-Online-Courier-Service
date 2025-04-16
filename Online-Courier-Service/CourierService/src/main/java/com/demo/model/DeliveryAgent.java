package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DeliveryAgent {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id; 
	private String name; 
	private String phone;
	private boolean available;
	public DeliveryAgent() {
		super();
	
	}
	public DeliveryAgent(Long id, String name, String phone, boolean available) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.available = available;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}

	}
