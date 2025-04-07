package com;

import java.io.Serializable;

public class Employee implements Serializable{
private int id;
private String name;
private float salary;
public int getId() {
	return id;
}

public Employee() {
	super();
	System.out.println("object created...");
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
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}
