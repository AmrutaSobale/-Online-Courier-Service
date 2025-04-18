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

import com.demo.model.Customer;
import com.demo.service.CustomerService;

@RestController @RequestMapping("/customers")
public class CustomerController {
	@Autowired 
	private CustomerService service;

	@PostMapping("/add")
	public Customer add(@RequestBody Customer c)
	{ 
		return service.save(c); 
	}

	@GetMapping("/all")
	public List<Customer> getAll() 
	{ 
		return service.getAll(); 
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id)
	{ 
		service.delete(id); 
	}

}
