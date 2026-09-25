package com.sandeep.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sandeep.entities.Student;

public interface StudentService {
	
	void saveStudent();
	List<Student> getAllEmployee();
	

}
