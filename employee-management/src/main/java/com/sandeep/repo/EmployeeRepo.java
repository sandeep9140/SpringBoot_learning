package com.sandeep.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sandeep.entities.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	List<Employee> findByDepartment(String department);
	
	List<Employee> findByDesignation(String designation);
	
	List<Employee> findByNameContainingIgnoreCase(String name);
	
	
	List<Employee> findBySalleryGreaterThan(double sallery);
	
	List<Employee> findBySalleryLessThan(double sallery);
	
	

}
