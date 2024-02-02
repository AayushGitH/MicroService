package com.micro.hotel.service;

import java.util.List;

import com.micro.hotel.entities.Hotel;

public interface HotelService {
	
	// Create hotel
	Hotel saveHotel(Hotel hotel);
	
	// Get single hotel
	Hotel getHotel(String hotelId);
	
	// Get all hotels
	List<Hotel> getAllHotels();

}
