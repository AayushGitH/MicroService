package com.micro.user.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.user.service.entities.User;
import com.micro.user.service.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController 
{
	@Autowired
	private UserService userService;
	
	// Create
	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
		User user1 = this.userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	
	// Get single User
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUser(@PathVariable Integer userId)
	{
		User user = this.userService.getUser(userId);
		return ResponseEntity.ok(user);
	}
	
	// Get all Users
	@GetMapping("/allusers")
	public ResponseEntity<List<User>> getUsers()
	{
		List<User> allUser = this.userService.getAllUser();
		return ResponseEntity.ok(allUser);
	}
	
	// Update User
	@PutMapping("/update")
	public ResponseEntity<Void> updateUser(@RequestBody User user)
	{
		this.userService.updateUser(user);
		return ResponseEntity.ok(null);
	}
	
	// Delete User
	@DeleteMapping("/user/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable Integer id)
	{
		this.userService.deleteUser(id);
		return ResponseEntity.ok(null);
	}
}
