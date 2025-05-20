package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleController {

	// http://localhost:8080
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String openPage() {
		System.out.println("I Came Here");
		return "index";			//	it check page inside templates folder with name as index
							// by default index page consider 
	}
}
