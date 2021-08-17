package com.springlearning1.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class SpringLearning1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearning1Application.class, args);
	}

	@GetMapping
	private String onPageLoad() {
		// TODO Auto-generated method stub
		return "Hello! Satya, Give a URL";

	}
	
	
}
