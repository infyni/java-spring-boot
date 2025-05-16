
package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleController {

	
	@RequestMapping(value = "hello",method = RequestMethod.GET)
	public ModelAndView sayHello() {
		// coding....
		System.out.println("I Came here");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display1.jsp");
		return mav;
	}
	
	@RequestMapping(value = "hi",method = RequestMethod.GET)
	public ModelAndView sayHi() {
		// coding....
		System.out.println("I Came here");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display2.jsp");
		return mav;
	}
}
