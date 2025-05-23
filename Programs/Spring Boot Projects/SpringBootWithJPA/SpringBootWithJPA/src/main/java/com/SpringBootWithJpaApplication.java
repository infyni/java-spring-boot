package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com")  // enable @Controller, @Service, @Repository annotation 
@EntityScan(basePackages = "com.bean")		// enable @Entity annotation 
public class SpringBootWithJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithJpaApplication.class, args);
		System.out.println("spring boot with jpa up ");
	}

}
