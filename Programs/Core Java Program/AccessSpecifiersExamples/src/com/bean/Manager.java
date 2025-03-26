package com.bean;

public class Manager extends Employee{

	public void displayManagerInfo() {
		//System.out.println("id is "+id);	// private can't access 
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
		System.out.println("desg is "+designation);
	}
}
