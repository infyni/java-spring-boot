package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "loginPage",method = RequestMethod.GET)
	public String openLoginPage() {
		System.out.println("Login Page");
		return "login";
	}
	
	@RequestMapping(value = "signPage",method = RequestMethod.GET)
	public String openSignInPage(Model mm) {  // Model is a api which help share the data between controller to view (thymeleaf)
		System.out.println("SignIn Page Open");
		mm.addAttribute("msg", "Welcome to Thymeleaf");			// request.setAttrbute("msg","information")
		return "signIn";
	}
	
	@RequestMapping(value = "checkLoginDetails",method = RequestMethod.POST)
	public String checkLoginInformation(HttpServletRequest req) {
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");
		if(emailid.equals("admin@gmail.com") && password.equals("123")) {
			return "success";
		}else {
			return "failure";
		}
	}
}
