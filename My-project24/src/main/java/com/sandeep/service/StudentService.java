package com.sandeep.service;

import java.util.List;

import com.sandeep.entities.Student;

public interface StudentService {
	
	void saveStudent();
	
	List<Student> getDataByName(String name);
	
	
	List<Student> getDataByAge(int age);

}
