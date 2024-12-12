package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserLoginServiceInterface;

public class UserLoginServiceImpl implements UserLoginServiceInterface {

	@Autowired
	UserRepository userRepo;

	@Override
	public boolean userExists(String id, String pass) {

		return userRepo.userExists(id, pass);
	}

}
