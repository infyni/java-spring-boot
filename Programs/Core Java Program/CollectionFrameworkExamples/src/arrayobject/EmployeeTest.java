package arrayobject;

import java.util.Scanner;

public class EmployeeTest {

	void dis() {
		System.out.println("main class method");
	}
	public static void main(String[] args) {
		//dis();
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("how many employee data do you want to store");
	int size = sc.nextInt();
	Employee employees[]=new Employee[size];
	System.out.println("Plz enter the all employee records one by one");
	for(int i=0;i<size;i++) {
		System.out.println("Enter the id");
		int id = sc.nextInt();
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter the salary");
		float salary = sc.nextFloat();
		employees[i]=new Employee(id, name, salary);
	}
	System.out.println("All Employee details are ");
	for(Employee emp :employees) {
		//System.out.println("id is "+emp.getEid()+" Name is "+emp.getEname()+" salary is  "+emp.getSalary());
		System.out.println(emp);  // it call super class toString method if you overriden then it will your toString method. 
	}
	}

}
