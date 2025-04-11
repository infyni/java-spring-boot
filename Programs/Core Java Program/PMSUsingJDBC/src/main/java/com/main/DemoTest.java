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
		System.out.println("1:Add Product 2 :Retrieve Product 3: Delete the Product 4 : Update product price 5: Find the Product ");
					System.out.println("Enter your choice");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:System.out.println("Add Product");
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
							List<Product> listOfProduct = ps.findAllProducts();
							for(Product p:listOfProduct) {
								System.out.println(p);   //it call toString method 
							}
							
							break;
					case 3:System.out.println("Delete Product");
							System.out.println("Enter the product id ");
							pid = sc.nextInt();
							result = ps.deleteProduct(pid);
							System.out.println(result);
							break;
					
					case 4:System.out.println("Udate Product");
							System.out.println("Enter the product id ");
							pid = sc.nextInt();
					
							System.out.println("Enter the new price");
							price = sc.nextFloat();
					
							Product p2= new Product();		// convert to objects. 
							p2.setPid(pid);
							p2.setPrice(price);
							result = ps.updateProduct(p2);			// pass the object to service layer 
							System.out.println(result);
							break;
					case 5 :System.out.println("Search the product");
						     System.out.println("Enter the product id to search product");
						     pid = sc.nextInt();
					         result = ps.findProduct(pid);
					         System.out.println(result);
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
