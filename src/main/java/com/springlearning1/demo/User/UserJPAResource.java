package com.springlearning1.demo.User;

import java.net.URI;
import java.util.List;
import java.util.Optional;

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
public class UserJPAResource {

	@Autowired
	private UserDao service;
	
	@Autowired  // To get the contents from the UserRepository interface  
	private UserRepository userRepo;
	
	// retrive all users
	@GetMapping("/jpa/users")
	public List<User> retriveAllUsers(){
		return userRepo.findAll();
	}
	
	// retrieve user (id)
	@GetMapping("/jpa/users/{id}")
	public Optional<User> retriveUserByID(@PathVariable int id) {
		Optional<User> findOne = userRepo.findById(id);
		if(! findOne.isPresent())
			throw new UserNotFoundException("Id :- "+ id);
		return findOne;
	}
	
	
	// To delete user by ID
		@DeleteMapping("/jpa/users/{id}")
		public void deleteUserById(@PathVariable int id) {
			userRepo.deleteById(id);
		}	
	

//		To create users
		@PostMapping("/jpa/users")
		public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
			User savedUser = userRepo.save(user);
			
			URI location = ServletUriComponentsBuilder.fromCurrentContextPath().
					path("/{id}").buildAndExpand(savedUser.getId()).toUri();
			
			return ResponseEntity.created(location).build();
			
		}
}
