package com.domo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Shipment;
import com.demo.service.ShipmentService;

@RestController @RequestMapping("/shipments")
public class ShipmentController {
	@Autowired
	private ShipmentService service;
	@PostMapping("/assign")
	public Shipment assign(@RequestParam Long courierId, @RequestParam Long agentId,
	                       @RequestParam String location) 
	{
	    
		return service.assignShipment(courierId, agentId, location);
	}

	@GetMapping("/all")
	public List<Shipment> getAll() 
	
	{
	    return service.getAll();
	}

}
