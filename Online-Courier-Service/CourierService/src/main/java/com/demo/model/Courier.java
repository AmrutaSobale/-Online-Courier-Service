package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Courier {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private String sourceAddress; 
	private String destinationAddress; 
	private double weight; private String status;


	public Courier() {
		super();
		
	}


	public Courier(Long id, String sourceAddress, String destinationAddress, double weight, String status) {
		super();
		this.id = id;
		this.sourceAddress = sourceAddress;
		this.destinationAddress = destinationAddress;
		this.weight = weight;
		this.status = status;
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getSourceAddress() {
		return sourceAddress;
	}


	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}


	public String getDestinationAddress() {
		return destinationAddress;
	}


	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	

}
