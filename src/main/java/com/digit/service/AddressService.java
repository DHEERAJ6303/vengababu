package com.digit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digit.entity.Address;
import com.digit.repository.AddressRepository;

@Service
public class AddressService {
	@Autowired
	AddressRepository repository;
	
	public Address addAddress(Address address) {
		return repository.save(address);
	}
}
