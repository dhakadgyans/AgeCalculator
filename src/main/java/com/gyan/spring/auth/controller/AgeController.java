package com.gyan.spring.auth.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeController {

	@GetMapping("/")
	public String home() {
		return " <h1>Welcome to Age Calculator App..</h1>\n\n<br><br>Please provide Birth Year in the url ..<br>e.g.: https://... /birth-year/2000";
	}
	
	
	@GetMapping("/birth-year/{year}")
	public int ageFinder(@PathVariable int year) {
		int finalage=0;
		
		Date date= new Date();
		String s= date.toString();
		String[] c=s.split(" ");
		int sys=Integer.parseInt(c[5]);
		finalage=sys-year;
		return finalage;
		
	}
}
