package org.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.training.entity.Hotel;
import org.training.entity.User;
import org.training.repository.HotelRepository;
import org.training.repository.UserRepository;

//@Service("hotelService")
@Service
public class HotelService {

	@Autowired
	private HotelRepository hotelRepository;
	
	//Adding new Hotel
	public boolean saveHotel(Hotel hotel, String hotelname) {
		if(hotelRepository.findById(hotelname).isPresent())
		{
			return true;
		}
		else
		{
			hotelRepository.save(hotel);
			return false;
		}
		
	}
	
	//update Hotel details
	public boolean updateHotel(Hotel hotel, String hotelname) {
		if(hotelRepository.findById(hotelname)!=null)
		{
			hotelRepository.delete(hotel);
			hotelRepository.save(hotel);
			return true;
		}
		else
		{
			return false;
		}
	}
}
