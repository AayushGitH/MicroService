package com.micro.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.hotel.entities.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, String>{

}
