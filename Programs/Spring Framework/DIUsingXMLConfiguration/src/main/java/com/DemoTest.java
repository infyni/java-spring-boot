package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
		//Employee emp1 = new Employee();
		//emp1.display();

	Resource res = new ClassPathResource("beans.xml");	// file loaded...
	BeanFactory factory = new XmlBeanFactory(res);	// we get the reference of beanFactory
	
//	Employee employee1 = (Employee)factory.getBean("emp1");  // pull the object from container 
//	employee1.display();
//	Employee employee3 = (Employee)factory.getBean("emp1");  // pull the object from container 
//	employee3.display();
//	System.out.println("-------------------");
//	Employee employee2 = (Employee)factory.getBean("emp2");  // pull the object from container 
//	employee2.display();	
//	Employee employee4 = (Employee)factory.getBean("emp2");  // pull the object from container 
//	employee4.display();
	
	
	Employee employee4 = (Employee)factory.getBean("emp1");
	System.out.println(employee4);   // toString method 
	
	Employee employee5 = (Employee)factory.getBean("emp2");
	System.out.println(employee5);   // toString method 
	
	Employee employee6 = (Employee)factory.getBean("emp3");
	System.out.println(employee6);   // toString method 
	}

}
