package com.micro.user.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.user.service.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> 
{

}
