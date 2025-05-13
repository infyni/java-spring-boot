package com.pms.main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pms.bean.Product;
import com.pms.service.ProductService;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Scanner sc = new Scanner(System.in);
		ProductService ps = (ProductService)ac.getBean("productService");
		int pid;
		String pname;
		float price;
		String con;
		int choice;
		String result;
		do {
			System.out.println("1:Add Product 2 :Delete Product 3 : Update Product 4 : Retrieve Prodcut");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:System.out.println("Enter the product id");
			        pid = sc.nextInt();
			        System.out.println("Enter the product name");
			        pname = sc.next();
			        System.out.println("Enter the product price");
			        price= sc.nextFloat();
			        Product p1 = (Product)ac.getBean("product");
			        p1.setPid(pid);
			        p1.setPname(pname);
			        p1.setPrice(price);
			        result = ps.storeProduct(p1);
			        System.out.println(result);
				break;
			case 2:System.out.println("Enter the product id");
	        	pid = sc.nextInt();
	        
	        	result = ps.deleteProduct(pid);
	        			System.out.println(result);
				
				break;
				
			case 3:System.out.println("Enter the product id");
	        pid = sc.nextInt();
	       
	        System.out.println("Enter the product price");
	        price= sc.nextFloat();
	        Product p2 = (Product)ac.getBean("product");
	        p2.setPid(pid);
	      
	        p2.setPrice(price);
	        result = ps.updateProduct(p2);
	        System.out.println(result);
		
				break;
		
			case 4:List<Map<String, Object>> ll = ps.findAllProducts();
					Iterator<Map<String,Object>> li = ll.iterator();
					while(li.hasNext()) {
						Map<String,Object> mm = li.next();
						System.out.println(mm);
					}
				
		
				break;
			default: System.out.println("Wrong choice");
				break;
			}
			System.out.println("do you want to continue");
			con  = sc.next();
		} while (con.equals("y"));
		
		
		
	}

}
