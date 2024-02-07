package com.carnation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carnation.model.User;
import com.carnation.service.UserService;

@RestController
@CrossOrigin("*")
public class UserController {

	@Autowired
	UserService us;

	@PostMapping("/book")
	public User bookUser(@RequestBody User user) {

		return us.bookUser(user);
	}

	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable("id") Long id) {
		return us.getUserById(id);
	}

	@DeleteMapping("/delete-user/{id}")
	public void deleteUserById(@PathVariable("id") Long id) {
		us.deleteUser(id);

	}
}
