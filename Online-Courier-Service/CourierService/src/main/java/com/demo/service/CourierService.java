package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Courier;
import com.demo.repository.CourierRepository;

@Service
public class CourierService {
	@Autowired 
	private CourierRepository repo;
	public Courier save(Courier c) 
	{ 
		return repo.save(c); 
	}
	public List<Courier> getAll() 
	{ 
		return repo.findAll(); 
	}
	public void delete(Long id)
	{ 
		repo.deleteById(id);
	}


}
