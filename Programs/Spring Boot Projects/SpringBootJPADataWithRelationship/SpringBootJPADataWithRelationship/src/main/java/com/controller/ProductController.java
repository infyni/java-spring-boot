package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Orders;
import com.bean.Product;
import com.service.OrdersService;
import com.service.ProductService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	
	@Autowired
	OrdersService orderService;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String indexPage(Model mm,Product product) {  // DI 
		List<Product> products = productService.findAllProduct();
		mm.addAttribute("products", products);
		mm.addAttribute("msg", "Welcome to Product Management System with Spring JPA Data Relationship");
		mm.addAttribute("pp", product);  
		mm.addAttribute("buttonValue", "Store Product");
		List<Orders> orders = orderService.findAllOrders();
		mm.addAttribute("orders", orders);
		return "index";
	}
	@RequestMapping(value = "addProductInDb",method = RequestMethod.POST)
	public String storeProductInDb(Model mm, Product product,HttpServletRequest req) {  // DI 
		String buttonNameValue = req.getParameter("bb1");
		System.out.println(buttonNameValue);
		String result = "";
		if(buttonNameValue.equals("Store Product")) {
			result = productService.storeProdcut(product);   // product hold the value from form.	
		}else {
			result = productService.updateProduct(product);
		}
		mm.addAttribute("buttonValue", "Store Product");
		product.setPid(0);
		product.setPname("");
		product.setPrice(0.0f);
		List<Product> products = productService.findAllProduct();
		mm.addAttribute("products", products);
		mm.addAttribute("msg", "Welcome to Product Management System with Spring JPA Data Relationship");
		mm.addAttribute("pp", product);  
		mm.addAttribute("result", result);
		List<Orders> orders = orderService.findAllOrders();
		mm.addAttribute("orders", orders);
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
		mm.addAttribute("buttonValue", "Store Product");
		List<Orders> orders = orderService.findAllOrders();
		mm.addAttribute("orders", orders);
		return "index";
	}
	
	
	@RequestMapping(value = "searchProductFromDb/{pid}",method = RequestMethod.GET)
	public String searchProductFromDb(Model mm, Product product,@PathVariable int pid) {  // DI 
		System.out.println("product pid is "+pid);
		Product p = productService.searchProduct(pid);
		List<Product> products = productService.findAllProduct();
		mm.addAttribute("products", products);
		mm.addAttribute("msg", "Welcome to Product Management System with Spring JPA Data Relationship");
		mm.addAttribute("pp", p);  
		//mm.addAttribute("result", result);
		mm.addAttribute("buttonValue", "Update Product");
		List<Orders> orders = orderService.findAllOrders();
		mm.addAttribute("orders", orders);
		return "index";
	}
	
	
	@RequestMapping(value = "orderPlace/{pid}",method = RequestMethod.GET)
	public String orderPlace(Model mm, Product product,@PathVariable int pid,Orders order) {  // DI 
		order.setPid(pid);
		String result = orderService.placeOrder(order);    // product id 
		List<Product> products = productService.findAllProduct();
		List<Orders> orders = orderService.findAllOrders();
		mm.addAttribute("products", products);
		mm.addAttribute("orders", orders);
		mm.addAttribute("msg", "Welcome to Product Management System with Spring JPA Data Relationship");
		mm.addAttribute("pp", product);  
		mm.addAttribute("result", result);
		mm.addAttribute("buttonValue", "Update Product");
		return "index";
	}
	
	

}
