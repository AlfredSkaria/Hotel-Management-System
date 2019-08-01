package org.training.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.training.entity.PaymentDetails;


//payment repository
@Repository
public interface PaymentRepository extends JpaRepository<PaymentDetails, String>{
	
}
