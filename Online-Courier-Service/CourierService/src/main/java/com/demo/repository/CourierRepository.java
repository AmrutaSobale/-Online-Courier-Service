package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Courier;

public interface CourierRepository extends JpaRepository<Courier, Long> {

}
