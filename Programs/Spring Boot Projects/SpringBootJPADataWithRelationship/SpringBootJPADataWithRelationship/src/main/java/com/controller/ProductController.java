package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Product;
import com.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String indexPage(Model mm,Product product) {  // DI 
		List<Product> products = productService.findAllProduct();
		mm.addAttribute("products", products);
		mm.addAttribute("msg", "Welcome to Product Management System with Spring JPA Data Relationship");
		mm.addAttribute("pp", product);  
		return "index";
	}
	@RequestMapping(value = "addProductInDb",method = RequestMethod.POST)
	public String storeProductInDb(Model mm, Product product) {  // DI 
		String result = productService.storeProdcut(product);   // product hold the value from form.
		List<Product> products = productService.findAllProduct();
		mm.addAttribute("products", products);
		mm.addAttribute("msg", "Welcome to Product Management System with Spring JPA Data Relationship");
		mm.addAttribute("pp", product);  
		mm.addAttribute("result", result);
		return "index";
	}

	@RequestMapping(value = "deleteProductFromDb/{pid}",method = RequestMethod.GET)
	public String deleteProductFromDb(Model mm, Product product,@PathVariable int pid) {  // DI 
		System.out.println("product pid is "+pid);
		String result = productService.deleteProduct(pid);  // product hold the value from form. 
		List<Product> products = productService.findAllProduct();
		mm.addAttribute("products", products);
		mm.addAttribute("msg", "Welcome to Product Management System with Spring JPA Data Relationship");
		mm.addAttribute("pp", product);  
		mm.addAttribute("result", result);
		return "index";
	}
	
//	
//	@RequestMapping(value = "deleteProductPage",method = RequestMethod.GET)
//	public String deleteProductPage(Model mm, Product product) {  // DI 
//		mm.addAttribute("pp", product);       // store product object with key as pp in model scope like request 
//		return "delete-product";
//	}
//	
//	@RequestMapping(value = "updateProductPage",method = RequestMethod.GET)
//	public String updateProductPage(Model mm, Product product) {  // DI 
//		mm.addAttribute("pp", product);       // store product object with key as pp in model scope like request 
//		return "update-product";
//	}
//	

//	
//	@RequestMapping(value = "updateProductFromDb",method = RequestMethod.POST)
//	public String updateProductFromDb(Model mm, Product product) {  // DI 
//		String result = productService.updateProduct(product);   // product hold the value from form. 
//		mm.addAttribute("result", result);
//		mm.addAttribute("pp", product);       // store product object with key as pp in model scope like request 
//		return "update-product";
//	}
//	
//	@RequestMapping(value = "deleteProductFromDb",method = RequestMethod.POST)
//	public String deleteProductFromDb(Model mm, Product product) {  // DI 
//		String result = productService.deleteProduct(product.getPid());  // product hold the value from form. 
//		mm.addAttribute("result", result);
//		mm.addAttribute("pp", product);       // store product object with key as pp in model scope like request 
//		return "delete-product";
//	}
//	
//	
//	@RequestMapping(value = "findAllProducts",method = RequestMethod.GET)
//	public String findAllProducts(Model model) {
//		List<Product> products = productService.findAllProduct();
//		model.addAttribute("products", products);
//		return "display-product";
//	}
}
