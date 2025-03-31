package com;

public class StringClassExamples {

	public static void main(String[] args) {
//		String str1 = "Welcome to Java Training";	// literal style object creation 
//		String str2 = new String("Welcome to Java Trainig"); // using new keyword. 
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str1.toLowerCase());
//		System.out.println(str2.toUpperCase());
//		System.out.println(str1.substring(4));
//		System.out.println(str1.substring(10, 16));
		
//		String str1 = "Raj";		// new memory 
//		String str2 = "Raj";		// str1 and str2 refer to same memory ie string pooling 
//		String str3 = new String("Raj");	// new memory 
//		String str4 = new String("Raj");	// new memory 
//		if(str3.equals(str2)) {
//			System.out.println("Equal");
//		}else {
//			System.out.println("Not Equal");
////		}
//		String name = "Raj";
//		System.out.println(name);
//		System.out.println(name.toUpperCase());
//		System.out.println(name);
//		name = name.toUpperCase();	// we assign the value to name variable 
//		System.out.println(name);
		String name = "Raj";
		System.out.println(name);
		name = name + " Deep";
		System.out.println(name);
		System.out.println("----------------");
		StringBuffer sb = new StringBuffer("Raj");
		System.out.println(sb);
		sb.append(" Deep");
		sb.insert(4, "Kumar ");
		//sb.reverse();
		
		System.out.println(sb);//mutable means original data effected. 
		
	}

}
