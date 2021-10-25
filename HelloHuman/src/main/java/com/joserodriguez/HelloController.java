package com.joserodriguez;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	// Tested with: http://localhost:8080
	@RequestMapping( "" )
	public String helloHuman( ) {
		String result = "";
		result ="<head>" +
				"<title>Hello Human</title>" +
				"</head>"+
				"<h1>Hello Human!</h1>"+
				 "<p>Welcome to SpringBoot!</p>";

		return result;
	}
	
	
	// Tested with http://localhost:8080/N?name=Jose
	@RequestMapping( value = "/N")
	public String helloName(  @RequestParam( value = "name" ) String name ) {
		
		String result = "";
		result ="<a href="+
				"http://localhost:8080/"+
				">Go Back</a>"+						
				"<head>" +
						"<title>Hello " + name + "</title>" +
				"</head>"+
				"<h1>Hello "+ name +
				"!"+
				"</h1>"+
				"<p>Welcome to SpringBoot!</p>";

		return result;
	}
	
	
	// Tested with: http://localhost:8080/FN?name=Jose&lastName=Rojas
	@RequestMapping( value = "/FN")
	public String helloName(  @RequestParam( value = "name" ) String name, @RequestParam( value = "lastName" ) String lastName ) {
		
		String result = "";
		result ="<a href="+
				"http://localhost:8080/"+
				">Go Back</a>"+						
				"<head>" +
						"<title>Hello " + name + " " + lastName + "</title>" +
				"</head>"+
				"<h1>Hello "+ name + " " + lastName +
				"!"+
				"</h1>"+
				"<p>Welcome to SpringBoot!</p>";

		return result;
	}
	
	
}
