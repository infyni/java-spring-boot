package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Product;
import com.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String indexPage(Model mm) {  // DI 
		mm.addAttribute("msg", "Welcome to Product Management System");       
		return "index";
	}
	
	@RequestMapping(value = "addProduct",method = RequestMethod.GET)
	public String addProductPage(Model mm, Product product) {  // DI 
		mm.addAttribute("pp", product);       // store product object with key as pp in model scope like request 
		return "add-product";
	}
	
	
	@RequestMapping(value = "addProductInDb",method = RequestMethod.POST)
	public String storeProductInDb(Model mm, Product product) {  // DI 
		String result = productService.storeProdcut(product);   // product hold the value from form. 
		mm.addAttribute("result", result);
		mm.addAttribute("pp", product);       // store product object with key as pp in model scope like request 
		return "add-product";
	}
}
