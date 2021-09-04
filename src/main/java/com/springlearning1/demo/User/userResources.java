package com.springlearning1.demo.User;

import java.net.URI;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class userResources {

	@Autowired
	private UserDao service;
	
	// retrive all users
	@GetMapping("/users")
	public List<User> retriveAllUsers(){
		return service.findAll();
	}
	
	// retrieve user (id)
	@GetMapping("/users/{id}")
	public User retriveUserByID(@PathVariable int id) {
		User findOne = service.findOne(id);
		if(findOne == null)
			throw new UserNotFoundException("Id :- "+ id);
		return findOne;
	}
	
//	To create users
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
		User savedUser = service.save(user);
		
		URI location = ServletUriComponentsBuilder.fromCurrentContextPath().
				path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		
		return ResponseEntity.created(location).build();
		
	}

// To delete user by ID
	@DeleteMapping("/users/{id}")
	public void deleteUserById(@PathVariable int id) {
		User user = service.deleteById(id);
		if(user == null)
			throw new UserNotFoundException("Id :- "+ id);	
	}	
	
}
