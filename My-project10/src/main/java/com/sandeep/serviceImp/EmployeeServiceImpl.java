package com.sandeep.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandeep.entities.Employee;
import com.sandeep.repo.EmployeeRepo;
import com.sandeep.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	@Override
	public Employee saveEmployee(Employee emp) {
		
		Employee saveData=repo.save(emp);
		
		return saveData;
	}
	
	@Override
	public void deleteEmployee(int a) {
	    repo.deleteById(a);
		
	}
	

}
