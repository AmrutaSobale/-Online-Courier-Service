package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Customer;
import com.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired 
	private CustomerRepository repo;
	public Customer save(Customer c) 
	{ 
		return repo.save(c); 
	}
	public List<Customer> getAll() 
	{ 
		return repo.findAll();
	}
	public void delete(Long id) 
	{ 
		repo.deleteById(id); 
	}

}
