package org.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.training.entity.Hotel;
import org.training.entity.User;


//hotel repository 
@Repository
public interface HotelRepository extends JpaRepository<Hotel, String>{

	/*Hotel findAll(String rating);*/
	List<Hotel> findByRating(String rating);

	

}
