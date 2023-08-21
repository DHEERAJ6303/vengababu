package com.digit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digit.entity.Restaurant;
import com.digit.repository.RestaurantRepository;

@Service
public class RestaurantService {
	@Autowired
	RestaurantRepository repository;
	
	public Restaurant addRestaurant(Restaurant restaurant) {
		return repository.save(restaurant);
	}
	
	public Restaurant findById(int id) {
		return repository.findById(id).get();
	}

}
