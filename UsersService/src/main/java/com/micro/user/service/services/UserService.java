package com.micro.user.service.services;

import java.util.List;
import java.util.Optional;

import com.micro.user.service.entities.User;

public interface UserService 
{
	// User operations
	
	// Create
	public User saveUser(User user);
	
	// Read
	public User getUser(int id);
	public List<User> getAllUser();
	
	// Update
	public void updateUser(User user);
	
	// Delete
	public void deleteUser(int id);
}
