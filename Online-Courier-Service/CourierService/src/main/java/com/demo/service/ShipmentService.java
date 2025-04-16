package com.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Courier;
import com.demo.model.DeliveryAgent;
import com.demo.model.Shipment;
import com.demo.repository.CourierRepository;
import com.demo.repository.DeliveryAgentRepository;
import com.demo.repository.ShipmentRepository;

@Service
public class ShipmentService {
	@Autowired private ShipmentRepository shipmentRepo;
	@Autowired private CourierRepository courierRepo;
	@Autowired private DeliveryAgentRepository agentRepo;

	public Shipment assignShipment(Long courierId, Long agentId, String location) {
	    Courier courier = courierRepo.findById(courierId).orElseThrow();
	    DeliveryAgent agent = agentRepo.findById(agentId).orElseThrow();

	    Shipment shipment = new Shipment();
	    shipment.setCourier(courier);
	    shipment.setAgent(agent);
	    shipment.setShipmentDate(LocalDate.now());
	    shipment.setCurrentLocation(location);

	    agent.setAvailable(false); 

	    agentRepo.save(agent);
	    return shipmentRepo.save(shipment);
	}

	public List<Shipment> getAll() {
	    return shipmentRepo.findAll();
	}

}
