package com.service;

import com.bean.Employee;

public class Department {

	Employee emp = new Employee();
	public void displayEmpInfoInDepartment() {
		//System.out.println("id is "+emp.id);		private can't 
		//System.out.println("name is "+emp.name);	default can't 
		//System.out.println("salary is "+emp.salary);	protected can't 
		System.out.println("desg is "+emp.designation);
	}
}
