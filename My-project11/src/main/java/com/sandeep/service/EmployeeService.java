package com.sandeep.service;

import java.util.List;

import com.sandeep.entities.Employee;

public interface EmployeeService {
	
	void saveEmployees();
	
	List<Employee> getAllEmployee();

}
