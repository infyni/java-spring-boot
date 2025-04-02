package com.main;

import java.util.Scanner;

//import com.service.ProductService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//ProductService ps = new ProductService();
		String con; 
		do {
			System.out.println("1:Add Product 2 :Retrieve Product");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:System.out.println("Add Product");
				
					break;
			case 2:System.out.println("Retreive Product");	
			
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
