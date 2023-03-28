package com.micro.user.service.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.user.service.dao.UserRepository;
import com.micro.user.service.entities.User;
import com.micro.user.service.exceptions.ResourceNotFoundException;
import com.micro.user.service.services.UserService;

@Service
public class UserServiceImpl implements UserService 
{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		return this.userRepository.save(user);
	}

	@Override
	public User getUser(int id) {
		return this.userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User with the given id is not found in the server !!"));
	}

	@Override
	public List<User> getAllUser() {
		return this.userRepository.findAll();
	}

	@Override
	public void updateUser(User user) {
		this.userRepository.save(user);
	}

	@Override
	public void deleteUser(int id) {
		this.userRepository.deleteById(id);;
	}
}
