package org.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.training.entity.Hotel;
import org.training.entity.PaymentDetails;
import org.training.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	
	//saving payment
	public void savePayment(PaymentDetails pay) {
		paymentRepository.save(pay);
	}
	
	//update reservation of hotels
	public boolean updateReservation(PaymentDetails pay,String email) {
		if(paymentRepository.findById(email)!=null)
		{
			paymentRepository.delete(pay);
			paymentRepository.save(pay);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	//cancel reservation of hotels
	public boolean cancelReservation(String email, String hotelname) {
		if(paymentRepository.findById(email)!=null)
		{
			paymentRepository.deleteById(email);
			return true;
		}
		else
		{
			return false;
		}
	}

}
