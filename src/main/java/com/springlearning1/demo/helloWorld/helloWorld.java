package com.springlearning1.demo.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// Controller
@RestController

public class helloWorld {

//	GET
//	URI :- /hello-world
//	method :- "hello World

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Welcome Satya!";
	}

//	To get the message from bean:-another class which have getter and setter
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello Satya");
	}

//	To pass the name in URl
	@GetMapping(path = "/hello-world-path-variable/{name}")
	public HelloWorldBean helloWorldPathVar(@PathVariable String name) {
		return new HelloWorldBean(String.format( "Hello, %s ", name));
	}
	
	// For localization purpose
//	To pass the name in URl
	@GetMapping(path = "/hello-world-internationalized")
	public String	 helloWorldIntern() {
		return  "Hello World, Internationalized message" ;
	}
	
	
}
