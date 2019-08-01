package org.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.training.entity.PaymentDetails;
import org.training.service.PaymentService;

@RestController
public class EditReservationController {
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping("/editReservation")
	public ModelAndView editReservationPage(ModelAndView modelAndView, PaymentDetails pay) {
		modelAndView.addObject("pay", pay);
		return new ModelAndView("editReservation");
	}
	
	
	//updating reservation details
	@PostMapping("/editReservation")
	public ModelAndView editReservationDetailsPage(ModelAndView modelAndView, @ModelAttribute PaymentDetails pay, @RequestParam String email)	{
		boolean status = paymentService.updateReservation(pay,email);
		if(status) {
			modelAndView.addObject("success", "Successfully updated");
			modelAndView.setViewName("editReservation");
			return modelAndView;
		}
		else
		{
			modelAndView.setViewName("editReservation");
			modelAndView.addObject("fail", "Not Successfully updated, Incorrect User account");
			return modelAndView;
		}
		
	}
	
	
}
