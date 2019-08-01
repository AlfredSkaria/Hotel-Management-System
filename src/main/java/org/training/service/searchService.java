package org.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.training.entity.Hotel;
import org.training.repository.HotelRepository;

@Service
public class searchService {
	
	@Autowired
	private HotelRepository hotelRepository;
	
	
	//search hotel details
	public List<Hotel> searchHotel(String rating) {
		
		
			return  hotelRepository.findByRating(rating);
		
		
	}
}
