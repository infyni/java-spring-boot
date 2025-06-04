package com.conroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	// http://localhost:8080/
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String firstController() {
		return "Welcome to Spring boot first micro service controller";
	}
}
