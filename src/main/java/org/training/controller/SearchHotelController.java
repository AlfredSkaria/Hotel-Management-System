package org.training.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.training.entity.Hotel;
import org.training.service.HotelService;
import org.training.service.UserService;
import org.training.service.searchService;

@RestController
public class SearchHotelController {

	@Autowired
	private UserService userService;
	@Autowired
	private HotelService hotelService;
	@Autowired
	private searchService searchService;
	
	@GetMapping("/searchHotel")
	public ModelAndView searchHotelPage(ModelAndView modelAndView) {
		
		modelAndView.setViewName("searchHotel");
		return modelAndView;
	}
	
	
	//search details of hotel
	@PostMapping("/searchHotel")
	public ModelAndView searchHotelDetails(ModelAndView modelandview, ModelMap models, @RequestParam String rating) {
		//Hotel hotel;
		List<Hotel> hotel1 = searchService.searchHotel(rating);
		System.out.println(hotel1);
		if(hotel1!=null)
		{
			models.addAttribute("names",true);
			models.addAttribute("hotelnames",hotel1);
			//request.setAttribute("names", hotel);
			modelandview.addObject("hotelnames", hotel1);
			modelandview.setViewName("searchHotel");
			return modelandview;
		}
		else
		{
			models.addAttribute("error", "no hotels");
			modelandview.setViewName("searchHotel");
			return modelandview;
		}
		
	}
	
}
