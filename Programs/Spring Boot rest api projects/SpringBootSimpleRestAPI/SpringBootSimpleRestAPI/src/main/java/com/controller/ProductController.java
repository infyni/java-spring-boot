package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;

@RestController
public class ProductController {

	// http://localhost:8080/findProduct
	
	@RequestMapping(value = "findProduct",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Product getProductInfo() {
		Product p = new Product(100, "TV", 56000);
		return p;
	}
	
	// http://localhost:8080/findAllProduct
	@RequestMapping(value = "findAllProduct",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProductInfo() {
		Product p1 = new Product(100, "TV", 56000);
		Product p2 = new Product(101, "Computer", 46000);
		Product p3 = new Product(102, "Mobile", 67000);
		List<Product> listOfProduct = new ArrayList<Product>();
		listOfProduct.add(p1);
		listOfProduct.add(p2);
		listOfProduct.add(p3);
		return listOfProduct;
	}
}
