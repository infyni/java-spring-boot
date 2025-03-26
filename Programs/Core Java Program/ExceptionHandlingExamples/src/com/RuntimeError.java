package com;

public class RuntimeError {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=1;
		int abc[]= {10,20,30,40};
		try {
		int sum = a/b;
		System.out.println("Sum is "+sum);
		int result = abc[1];
		System.out.println("result is "+result);
		}catch(Exception e) {
			//System.out.println("I Take Care!");
			//System.out.println(e.getMessage());  // short message of exception 
			System.out.println(e.toString());  // display name as well as message
		}
		System.out.println("bye....");
		System.out.println("bye....");
		System.out.println("bye....");
	}

}
