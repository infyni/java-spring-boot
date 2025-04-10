package com.main;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.bean.Product;
import com.service.ProductService;

public class DemoTest {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				ProductService ps = new ProductService();
				String con; 
				int pid;
				String pname;
				float price;
				String result;
				do {
					System.out.println("1:Add Product 2 :Retrieve Product 3: Delete the Product 4 : Update product price");
					System.out.println("Enter your choice");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:System.out.println("Add Product");
							// receive the value through keyboards 
							System.out.println("Enter the product id ");
							pid = sc.nextInt();
							System.out.println("Enter the product name");
							pname = sc.next();
							System.out.println("Enter the price");
							price = sc.nextFloat();
							
							Product p1= new Product(pid, pname, price);		// convert to objects. 
							result = ps.storeProduct(p1);			// pass the object to service layer 
							System.out.println(result);
							break;
					case 2:System.out.println("Retreive Product");	
			
							
							break;
					case 3:System.out.println("Delete Product");
						
							break;
					
					case 4:System.out.println("Udate Product");
						
							break;
					default:System.out.println("wrong choice");
							break;
					}
					System.out.println("Do you want to continue(y/n)");
					con = sc.next();
				} while (con.equalsIgnoreCase("y"));
				System.out.println("Thank you!");
				sc.close();

	}

}
