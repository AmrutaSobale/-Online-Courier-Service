package com.domo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.DeliveryAgent;
import com.demo.service.DeliveryAgentService;

@RestController @RequestMapping("/agents")
public class DeliveryAgentController {
	@Autowired 
	private DeliveryAgentService service;

	@PostMapping("/add")
	public DeliveryAgent add(@RequestBody DeliveryAgent a)
	{
		return service.save(a); 
	}

	@GetMapping("/all")
	public List<DeliveryAgent> getAll()
	{
		return service.getAll(); 
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) 
	{ 
		service.delete(id);
	}


}
