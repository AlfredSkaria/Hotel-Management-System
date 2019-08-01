package org.training.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.training.entity.User;
import org.training.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	
	//adding new user
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	//validation of user for login
	public boolean validate(String email, String password) {
		System.out.println("mail:"+email);
		Optional<User> user = userRepository.findById(email);
		//System.out.println("mailid23:"+user.getEmail());
		if((user)!=null)
		{
			//System.out.println("mailid:"+user.getEmail());
			if(user.get().getPassword().equals(password))
			{
				System.out.println("valid user");
				return true;
			}
			else
			{
				return false;
			}
		}
		else
			return false;
		
	}
}
