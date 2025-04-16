package com.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Shipment {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Courier courier;
	private DeliveryAgent agent;
	private LocalDate now;
	private String loacation ;
	

	public Shipment() {
		super();
	
	}

	public Shipment(Long id) {
		super();
		this.id = id;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	
}

	public void setCourier(Courier courier) {
		this.courier = courier;
		
	}

	public void setAgent(DeliveryAgent agent) {
		this.agent =agent;
		
	}

	public void setShipmentDate(LocalDate now) {
		this.now = now;
		
	}

	public void setCurrentLocation(String location) {
		this.loacation = location;
	}
}
