package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.DeliveryAgent;
import com.demo.repository.DeliveryAgentRepository;

@Service
public class DeliveryAgentService {
	@Autowired 
	private DeliveryAgentRepository repo;
	public DeliveryAgent save(DeliveryAgent a) 
	{ 
		return repo.save(a); 
	}
	public List<DeliveryAgent> getAll() 
	{ 
		return repo.findAll(); 
	}
	public void delete(Long id) 
	{ 
		repo.deleteById(id);
	}

}
