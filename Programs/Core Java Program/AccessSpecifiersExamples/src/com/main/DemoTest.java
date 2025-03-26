package com.main;

import com.bean.Employee;
import com.bean.Manager;
import com.entity.Developer;
import com.service.Department;

public class DemoTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.displayEmp();
		System.out.println("------------------");
		Manager mgr = new Manager();
		mgr.displayManagerInfo();
		System.out.println("----------------------");
		Developer dd  = new Developer();
		dd.displayDeveloper();
		System.out.println("-----------------------");
		Department dept = new Department();
		dept.displayEmpInfoInDepartment();
	}
}
