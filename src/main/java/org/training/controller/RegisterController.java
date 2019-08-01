package org.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.training.entity.User;
import org.training.service.UserService;

@RestController
public class RegisterController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/register")
	public ModelAndView registerPage(ModelAndView modelAndView, User user) {
		modelAndView.addObject("user", user);
		modelAndView.setViewName("register");
		return modelAndView;
	}
	
	//registration of user
	@PostMapping("/register")
	public ModelAndView processingRegistrationForm(ModelAndView modelAndView,@ModelAttribute User user) {
	
		
		System.out.println("username: " + user.getName());
		
		userService.saveUser(user);
		
		modelAndView.setViewName("redirect:/login");
		return modelAndView;
		
	}

}
