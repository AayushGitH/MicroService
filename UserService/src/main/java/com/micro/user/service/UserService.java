package com.micro.user.service;

import java.util.List;

import com.micro.user.entities.User;

public interface UserService {

	// Save user
	User saveUser(User user);
	
	// List all users
	List<User> getAllUser();
	
	// Get single user
	User getUser(String userId);
}
