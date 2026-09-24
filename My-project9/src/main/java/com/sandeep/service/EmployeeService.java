package com.sandeep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandeep.entities.Employee;
import com.sandeep.repo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo repo;
	
	public void saveEmployee(Employee employee) {
		repo.save(employee);
	}

}
