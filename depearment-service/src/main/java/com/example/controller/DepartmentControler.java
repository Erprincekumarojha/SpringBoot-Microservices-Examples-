package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Department;
import com.example.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;



@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentControler {
	
	@Autowired
	private DepartmentService service;
	
  @PostMapping("/")
  public Department saveDepartment(@RequestBody Department departmenr) {
	  log.info("inside the saveDepartment DeparmentController");
	  
	  return service.saveDepartment(departmenr);  
  }
  
  @GetMapping("/{id}")
  public Department findDepartmentById(@PathVariable("id") Long departmentId) {
	  log.info("inside the findDepartmentById DeparmentController");
	  
	  return service.findByDepartmentId(departmentId);
  }
  

}
