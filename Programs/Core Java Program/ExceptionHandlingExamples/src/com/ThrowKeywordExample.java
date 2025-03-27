package com;

import java.util.Scanner;

public class ThrowKeywordExample {

	public static void main(String[] args) {
	int age;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the age");
	age = sc.nextInt();		// 100/0 new ArithmeticException();
	try {
	if(age>=21) {
		System.out.println("YOu Can Vote!");
	}else {
		//throw new Exception();		// throw generic exception
		//throw new Exception("Age must be >=21");		// throw generic exception with message 
		//throw new VoteException();		// custom exception 
		throw new VoteException("Age must be >=21"); // custom exception with custom message 
	}}catch(Exception e) {
		System.out.println(e.toString());
	}

	}

}
