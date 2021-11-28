package com.data.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.jpa.dto.OrderRequest;
import com.data.jpa.entity.Customer;
import com.data.jpa.repository.CustomerRepository;
import com.data.jpa.repository.ProductRepository;

@RestController
public class OrderController {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest orderRequest) {
		return customerRepository.save(orderRequest.getCustomer());
	}
	@GetMapping("/findAllOrders")
	public List <Customer> findAllOrders(){
		return customerRepository.findAll();
	}
	
}
