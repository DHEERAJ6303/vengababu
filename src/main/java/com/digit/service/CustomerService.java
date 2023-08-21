package com.digit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digit.entity.Customer;
import com.digit.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository repository;
	
	public Customer addCustomer(Customer customer) {
		return repository.save(customer);
	}

}
