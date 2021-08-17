package com.springlearning1.demo.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

	private static List<User> users = new ArrayList<>();
	private static int userCount= 3;

	static {
		users.add(new User(1, "Teja", new Date()));
		users.add(new User(2, "Satya", new Date()));
		users.add(new User(3, "Sai", new Date()));
	}
	
	// find all API
	public List<User> findAll() {
		return users;
		
	}
	
	// To save data
	public User save (User user) {
		if(user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	} 
	
	 // To find only particular record
	public User findOne (int id) {
		for (User user:users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	
	
	

}
