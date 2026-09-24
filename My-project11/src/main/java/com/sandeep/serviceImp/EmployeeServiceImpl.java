package com.sandeep.serviceImp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sandeep.entities.Employee;
import com.sandeep.repo.EmployeeRepo;
import com.sandeep.service.EmployeeService;

@Service
public class EmployeeServiceImpl  implements EmployeeService{

	@Autowired
	private EmployeeRepo repo;
	@Override
	public void saveEmployees() {
		
		List<Employee> emps=Arrays.asList(
				new Employee("sandeep","22"),
				new Employee("andeep1","22"),
				new Employee("ndeep2","22"),
				new Employee("ndeep3","22"),
				new Employee("deep4","22"),
				new Employee("eep5","22"),
				new Employee("sandeep6","22"),
				new Employee("sandeep7","22"),
				new Employee("sandeep8","22"),
				new Employee("sandeep9","22"),
				new Employee("sandeep10","22")
						
				);
		
		repo.saveAll(emps);
		
		
		System.out.println("all employee saved here ");
		
		
	}
	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> list=repo.findAll(Sort.by("name").descending());
;		return list;
	}
	
	
	

}
