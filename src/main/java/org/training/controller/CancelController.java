package org.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.training.service.PaymentService;

@RestController
public class CancelController {
	
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping("/cancelReservation")
	public ModelAndView cancelReservationPage() {
		
		return new ModelAndView("cancelReservation");
	}
	
	//Cancel Reservation of hotels
	@PostMapping("/cancelReservation")
	public ModelAndView cancelReservationDetails(ModelAndView modelAndView, @RequestParam String email, @RequestParam String hotelname) {
		boolean status = paymentService.cancelReservation(email,hotelname);
		if(status) {
			modelAndView.addObject("success", "Successfully Deleted");
			modelAndView.setViewName("cancelReservation");
			return modelAndView;
		}
		else {
			modelAndView.setViewName("cancelReservation");
			modelAndView.addObject("fail", "Invalid details, cannot delete record");
			return modelAndView;
		}
		
	}

}
