package com.micro.hotel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.hotel.entities.Hotel;
import com.micro.hotel.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;

	@PostMapping
	public ResponseEntity<Hotel> saveHotelHandler(@RequestBody Hotel hotel) {
		Hotel saveHotel = this.hotelService.saveHotel(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveHotel);
	}
	
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getHotelHandler(@PathVariable String hotelId) {
		Hotel hotel = this.hotelService.getHotel(hotelId);
		return ResponseEntity.status(HttpStatus.OK).body(hotel);
	}
	
	@GetMapping
	public ResponseEntity<List<Hotel>> getHotelsHandler() {
		List<Hotel> allHotels = this.hotelService.getAllHotels();
		return ResponseEntity.status(HttpStatus.OK).body(allHotels);
	}
}
