package com.springlearning1.demo.User;

import java.util.Date;

public class User {

	private Integer Id;
	private String name;
	private Date birthDate;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String name, Date date ) {
		super();
		Id = id;
		this.name = name;
		this.birthDate = birthDate;
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
