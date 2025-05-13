package com.pms.main;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pms.bean.Product;
import com.pms.service.ProductService;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
//		Product p1 = (Product)ac.getBean("product");
//		p1.setPid(105);
//		p1.setPname("Mobile");
//		p1.setPrice(56000);
//		
//		ProductService ps = (ProductService)ac.getBean("productService");
//		String result  = ps.storeProduct(p1);
//		System.out.println(result);
		
		// retrieve product information 
		ProductService ps = (ProductService)ac.getBean("productService");
		List<Product> listOfProduct = ps.findAllProducts();
		Iterator<Product> li = listOfProduct.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			System.out.println(p);    // toString method must be overrided...
		}
		
	}

}
