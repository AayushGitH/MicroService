package com.micro.hotel.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.hotel.entities.Hotel;
import com.micro.hotel.exception.ResourceNotFoundException;
import com.micro.hotel.repository.HotelRepo;
import com.micro.hotel.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepo hotelRepo;

	@Override
	public Hotel saveHotel(Hotel hotel) {
		String id = UUID.randomUUID().toString();
		hotel.setId(id);
		return this.hotelRepo.save(hotel);
	}

	@Override
	public Hotel getHotel(String hotelId) {
		return this.hotelRepo.findById(hotelId).orElseThrow(()-> new ResourceNotFoundException("Resource not found with the id - " + hotelId));
	}

	@Override
	public List<Hotel> getAllHotels() {
		return this.hotelRepo.findAll();
	}

}
