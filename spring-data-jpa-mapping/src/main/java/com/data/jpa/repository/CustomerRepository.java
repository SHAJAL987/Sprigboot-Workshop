package com.data.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.jpa.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
