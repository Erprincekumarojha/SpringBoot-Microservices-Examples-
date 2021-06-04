package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.VO.ResponseTemplateVO;
import com.example.entity.User;
import com.example.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		log.info("inside the saveUser UserController class");	
		return service.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
		log.info("inside the getUserWithDepartment UserController class");	
		 return service.getUserWithDepartment(userId);
		
		
	}

}
