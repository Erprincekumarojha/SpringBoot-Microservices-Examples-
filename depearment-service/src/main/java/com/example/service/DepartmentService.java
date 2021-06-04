package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Department;
import com.example.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository repository;

	public Department saveDepartment(Department departmenr) {
		log.info("inside the saveDepartment DepartmentService");
		return repository.save(departmenr);

	}

	

	public Department findByDepartmentId(Long departmentId) {
		log.info("inside the findDepartmentById DepartmentService");
        return repository.findByDepartmentId(departmentId);
	}

}
