package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component				// <bean class="com.Employee"></bean> by default id is employee 
@Scope("prototype")
public class Employee {
@Value(value = "1")
private int id;
@Value(value = "Unknown")
private String name;
@Value(value = "6000")
private float salary;
@Autowired			// byType consider 
private Address add;		// Employee has a address. 
	
	public Employee() {
		System.out.println("constructor called...empty");
	}

	public Employee(int id, String name, float salary) {
		System.out.println("constructor called...parameter");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println("This is employee class method");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	
	
}
