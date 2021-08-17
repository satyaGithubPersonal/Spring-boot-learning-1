package com.springlearning1.demo.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userResources {

	@Autowired
	private UserDao service;
	
	// retrive all users
	@GetMapping("/users")
	public List<User> retriveAllUsers(){
		return service.findAll();
	}
	
	
	
	// retrive user (id)
	
	
	
	
}
