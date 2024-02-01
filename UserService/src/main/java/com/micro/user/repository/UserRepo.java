package com.micro.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.user.entities.User;

public interface UserRepo extends JpaRepository<User, String> {

}
