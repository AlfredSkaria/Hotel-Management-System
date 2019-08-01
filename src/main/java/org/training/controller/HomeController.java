package org.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.training.service.UserService;

@RestController
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/home")
	public ModelAndView homePage() {
		
		return new ModelAndView("home");
	}

}
