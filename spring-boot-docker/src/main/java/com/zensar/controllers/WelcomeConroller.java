package com.zensar.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeConroller {

	@GetMapping("/hello")
	public String sayHello() {
		return "<h2>Welcome to Spring Boot</h2";
	}
}
