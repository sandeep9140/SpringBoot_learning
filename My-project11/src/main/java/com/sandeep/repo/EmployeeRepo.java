package com.sandeep.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sandeep.entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
