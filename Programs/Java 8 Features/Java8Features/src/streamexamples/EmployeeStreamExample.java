package streamexamples;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStreamExample {

	public static void main(String[] args) {
	List<Employee> listofEmployees  = new ArrayList<Employee>();
	listofEmployees.add(new Employee(100, "Ravi", 41000));
	listofEmployees.add(new Employee(101, "Ramesh", 45000));
	listofEmployees.add(new Employee(102, "Lokesh", 42000));
	listofEmployees.add(new Employee(103, "Ajay", 49000));

	// display all employees from list using stream concept. 
	//listofEmployees.stream().forEach(e->System.out.println(e));
	
	// display only those employee details whose salary is > 45000
	
	//listofEmployees.stream().filter(emp->emp.getSalary()>=45000).forEach(e->System.out.println(e));
	
	// any person getting salary >= 45000
//	boolean result1 = listofEmployees.stream().anyMatch(e->e.getSalary()>=50000);
//	System.out.println(result1);
	
	
	long result2 = listofEmployees.stream().filter(emp->emp.getSalary()>=50000).count();
	System.out.println(result2);
	}

}
