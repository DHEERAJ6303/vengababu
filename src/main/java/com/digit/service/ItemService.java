package com.digit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digit.entity.Item;
import com.digit.repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
	ItemRepository repository;
	
	public Item addItem(Item item) {
		return repository.save(item);
	}

}
