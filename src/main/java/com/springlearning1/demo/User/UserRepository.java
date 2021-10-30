package com.springlearning1.demo.User;

import org.springframework.data.jpa.repository.JpaRepository;


// Here inputs are which class and primary key of db
public interface UserRepository extends JpaRepository<User, Integer> {

	
	
	
}
