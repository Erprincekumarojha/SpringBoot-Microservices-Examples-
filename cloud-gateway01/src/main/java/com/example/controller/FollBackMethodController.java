package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FollBackMethodController {
	
	@GetMapping("/userServiceFollBack")
	public String userServiceFollBackMethod() {
		
		return "User Service is taken longer then expected"+
		"please try again later";
	}

	@GetMapping("/departmentServiceFollBack")
   public String departmentServiceFollBackMethod() {
		
		return "Department Service is taken longer then expected"+
		"please try again later";
	}

}
