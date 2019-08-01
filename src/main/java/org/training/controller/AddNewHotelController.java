package org.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.training.entity.Hotel;
import org.training.entity.User;
import org.training.service.HotelService;
import org.training.service.UserService;

@RestController
public class AddNewHotelController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private HotelService hotelService;
	

	@GetMapping("/addNewHotel")
	public ModelAndView addNewHotelPage() {
		
		return new ModelAndView("addNewHotel");
	}
	
	@GetMapping("/addHotel")
	public ModelAndView addHotelPage(ModelAndView modelAndView, Hotel hotel) {
		modelAndView.addObject("hotel", hotel);
		modelAndView.setViewName("addHotel");
		return modelAndView;
	}
	
	
	//Adding details of new hotel by admin
	@PostMapping("/addHotel")
	public ModelAndView addHotelDetails(ModelAndView modelandview, @ModelAttribute Hotel hotel, @RequestParam String hotelname, ModelMap models) {
		
		System.out.println("hotelname: " + hotel.getHotelname());
		//save new hotel details
		boolean status = hotelService.saveHotel(hotel, hotelname);
		if(status==true)
		{
				models.addAttribute("erroradd", "Hotel With same name exists");
				modelandview.setViewName("addHotel");
		}
		else
		{
				
				modelandview.setViewName("addHotel");
		}
		return modelandview;
		
	}
	

}
