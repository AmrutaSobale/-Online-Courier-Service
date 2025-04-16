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

import com.demo.model.Courier;
import com.demo.service.CourierService;

@RestController @RequestMapping("/couriers") 
public class CourierController {
	@Autowired 
	private CourierService service;
	@PostMapping("/add")
	public Courier add(@RequestBody Courier c) 
	{ 
		return service.save(c);
	}

	@GetMapping("/all")
	public List<Courier> getAll()
	{
		return service.getAll();
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) 
	{ 
		service.delete(id);
	}

}
