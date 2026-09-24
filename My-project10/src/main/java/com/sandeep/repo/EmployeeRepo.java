package com.sandeep.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sandeep.entities.Employee;
@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

}
