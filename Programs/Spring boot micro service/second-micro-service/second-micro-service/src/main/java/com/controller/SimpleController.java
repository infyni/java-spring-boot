package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	// http://localhost:8181
	
	@RequestMapping(value = "/")
	public String sayHello() {
		return "Welcome to Spring boot second micro service project ";
	}
}
