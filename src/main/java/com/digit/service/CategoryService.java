package com.digit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digit.entity.Category;
import com.digit.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	CategoryRepository repository;
	
	public Category addCategory(Category category) {
		return repository.save(category);
	}

}
