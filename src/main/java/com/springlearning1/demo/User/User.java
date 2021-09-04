package com.springlearning1.demo.User;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class User {

	private Integer Id;
	@NonNull
	@Size(min=2, max=10, message = "Name should be minimum 2 and maximum 10 characters.." )
	private String name;
	@Past
	private Date birthDate;

	protected User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String name, Date date ) {
		super();
		Id = id;
		this.name = name;
		this.birthDate = date;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}

}
