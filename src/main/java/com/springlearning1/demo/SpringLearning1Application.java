package com.springlearning1.demo;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
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
	
	@Bean
	public LocaleResolver localResolver () {
		SessionLocaleResolver localeResolver = new SessionLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);
		return localeResolver;
	}
	
	
}
