package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.DeliveryAgent;

public interface DeliveryAgentRepository extends JpaRepository<DeliveryAgent, Long>{

}
