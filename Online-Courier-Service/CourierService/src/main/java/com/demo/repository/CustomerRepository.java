package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Long>  {

}
