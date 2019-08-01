package org.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.training.entity.PaymentDetails;
import org.training.entity.User;
import org.training.service.PaymentService;

@RestController
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping("/payment")
	public ModelAndView paymentPage(ModelAndView modelAndView, PaymentDetails pay) {
		modelAndView.addObject("pay", pay);
		return new ModelAndView("payment");
	}
	
	//payment of reserved hotels
	@PostMapping("/payment")
	public ModelAndView paymentDetails(ModelAndView model, @ModelAttribute PaymentDetails pay) {
		paymentService.savePayment(pay);
		model.addObject("success", "Payment successfull");
		model.setViewName("payment");
		return model;
	}

}
