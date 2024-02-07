package com.carnation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carnation.dao.UserRepository;
import com.carnation.model.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository ur;

	public User bookUser(User user) {
		return ur.save(user);
	}

	public User getUserById(Long id) {
	
		return ur.findById(id).get();
	}

	public void deleteUser(Long id) {
		
		ur.deleteById(id);
	}

}
