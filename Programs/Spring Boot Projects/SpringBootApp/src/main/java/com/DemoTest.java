package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoTest {

	public static void main(String[] args) {
		SpringApplication.run(DemoTest.class, args);
		System.err.println("Spring boot up!");
	}

}
