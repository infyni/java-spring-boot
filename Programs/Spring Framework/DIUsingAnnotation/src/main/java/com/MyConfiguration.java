package com;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration			// equal to beans.xml file 
@ComponentScan(basePackages = "com")			// equal to component scan tag <context:component-scan base-package="com"></context:component-scan>
public class MyConfiguration {

}
