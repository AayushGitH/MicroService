package com.micro.user.service.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class User 
{
	// Properties
	@Id
	@Column(name="Id")
	private int Id;
	@Column(name="Name",length = 25)
	private String name;
	@Column(name="Email")
	private String email;
	@Column(name="About")
	private String about;
	
	@Transient // This will restrict it to store into database
	private List<Rating> ratings = new ArrayList<>();
	
}
