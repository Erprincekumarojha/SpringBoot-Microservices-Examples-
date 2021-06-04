package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.VO.Department;
import com.example.VO.ResponseTemplateVO;
import com.example.entity.User;
import com.example.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository repository;

	@Autowired
	private RestTemplate restTemplate;
	
	public User saveUser(User user) {
	 log.info("inside the saveUser UserService class");	
    return repository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		
		log.info("inside the getUserWithDepartment UserService class ");
	   
		ResponseTemplateVO vo=new ResponseTemplateVO();
		User user=repository.findByUserId(userId);
		Long departmentId=user.getDepartmentId();
		
		Department department=restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+departmentId,Department.class);
		
		vo.setUser(user);
		vo.setDepartment(department);
		return vo; 
	}
	
	
}
