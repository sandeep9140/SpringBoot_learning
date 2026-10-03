package com.sandeep.service;

import java.util.List;
import java.util.Optional;

import com.sandeep.entities.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
	
	Optional<Employee> getEmployeeById(Integer id);
	
	
	void deleteEmployee(Integer id);
	
	List<Employee> findByName(String name);

}
