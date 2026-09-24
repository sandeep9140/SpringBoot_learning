package com.sandeep.repo;

import org.springframework.data.repository.CrudRepository;

import com.sandeep.entities.Employee;

public interface EmployeeRepo  extends CrudRepository<Employee, Integer>{

}
