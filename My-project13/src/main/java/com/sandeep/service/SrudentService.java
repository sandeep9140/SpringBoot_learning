package com.sandeep.service;

import java.util.List;

import com.sandeep.entities.Student;

public interface SrudentService {
	
	void saveStudents();
	
	List<Student> getAllStudent();
	
	void deleteStudent();
	
	
	long countRecord();

}
