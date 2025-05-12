package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
		
	//Resource res = new ClassPathResource("beans.xml");	// file loaded...
	//BeanFactory factory = new XmlBeanFactory(res);	// we get the reference of beanFactory
	// partial xml base 
//	ApplicationContext ac  = new ClassPathXmlApplicationContext("beans.xml");
//	Address address1  = (Address)ac.getBean("address");
//	System.out.println(address1);
//	address1.setCity("Bangalore");
//	address1.setState("Kar");
//	System.out.println(address1);
//	System.out.println("----------");
//	Employee employee1 = (Employee)ac.getBean("employee");
//	System.out.println(employee1);
		
		// pure class base no xml file 
AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
Address address1  = (Address)ac.getBean("address");
System.out.println(address1);
address1.setCity("Bangalore");
address1.setState("Kar");
System.out.println(address1);
System.out.println("----------");

Employee employee1 = (Employee)ac.getBean("employee");
employee1.setId(100);
employee1.setName("Ravi");
employee1.setSalary(34000);
employee1.getAdd().setCity("Bangalore");
employee1.getAdd().setState("Kar");
System.out.println(employee1);	

Employee employee2 = (Employee)ac.getBean("employee");
employee2.setId(101);
employee2.setName("Ajay");
employee2.setSalary(39000);
employee2.getAdd().setCity("Bidar");
employee2.getAdd().setState("Kar");

System.out.println(employee2);


	}

}
