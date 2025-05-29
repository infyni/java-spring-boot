package com.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	// http://localhost:8080/hello 
	
	@RequestMapping(value = "hello",method = RequestMethod.GET)
	public String sayHello() {
		return "Welcome to Spring boot rest api";
	}
	// http://localhost:8080/plain 
	@RequestMapping(value = "plain",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayMessageInPlainText() {
		return "<h2>Welcome to Spring boot rest api</h2>";
	}
	// http://localhost:8080/html
	@RequestMapping(value = "html",method = RequestMethod.GET,produces = MediaType.TEXT_HTML_VALUE)
	public String sayMessageInHtmlFormat() {
		return "<h2>Welcome to Spring boot rest api</h2>";
	}
	// http://localhost:8080/xml 
	@RequestMapping(value = "xml",method = RequestMethod.GET,produces = MediaType.TEXT_XML_VALUE)
	public String sayMessageInXMLForamt() {
		return "<h2>Welcome to Spring boot rest api</h2>";
	}
}
