package com.entity;

import com.bean.Employee;

public class Developer extends Employee{

	public void displayDeveloper() {
		//System.out.println("id is "+id);	// private can't 
		//System.out.println("name is "+name);	// default can't 
		System.out.println("salary is "+salary);
		System.out.println("desg is "+designation);
	}
}
