package org.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.training.entity.User;


//find by email
@Repository
public interface UserRepository extends JpaRepository<User, String>{
	//finding users by email
	User findByEmail(String email);

}
