package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Shipment;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

}
