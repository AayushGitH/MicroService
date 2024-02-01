package com.micro.user.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.user.entities.User;
import com.micro.user.exception.ResourceNotFoundException;
import com.micro.user.repository.UserRepo;
import com.micro.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public User saveUser(User user) {
		String randomId = UUID.randomUUID().toString();
		user.setUserId(randomId);
		return this.userRepo.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return this.userRepo.findAll();
	}

	@Override
	public User getUser(String userId) {
		return this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User not found with the id - " + userId));
	}

}
