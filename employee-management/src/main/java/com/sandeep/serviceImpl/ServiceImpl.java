package com.sandeep.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandeep.entities.Employee;
import com.sandeep.repo.EmployeeRepo;
import com.sandeep.service.EmployeeService;

@Service
public class ServiceImpl implements EmployeeService{

	
	@Autowired
	private EmployeeRepo repo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		
		return repo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
	
		return repo.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(Integer id) {
		
		return repo.findById(id);
	}

	@Override
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
		
	}

	@Override
	public List<Employee> findByName(String name) {
	
		return repo.findByNameContainingIgnoreCase(name);
	}
	
	
	

}
