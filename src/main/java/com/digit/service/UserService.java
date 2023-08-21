package com.digit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digit.entity.LogIn;
import com.digit.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository repository;
	
	public LogIn addUser(LogIn user) {
		return repository.save(user);
	}

}
