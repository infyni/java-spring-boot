package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
		

	//Resource res = new ClassPathResource("beans.xml");	// file loaded...
	//BeanFactory factory = new XmlBeanFactory(res);	// we get the reference of beanFactory
	
	ApplicationContext ac  = new ClassPathXmlApplicationContext("beans.xml");
	Address address1  = (Address)ac.getBean("address");
	System.out.println(address1);
	address1.setCity("Bangalore");
	address1.setState("Kar");
	System.out.println(address1);
	}

}
