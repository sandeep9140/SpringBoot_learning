package com.sandeep.service;

import org.springframework.data.domain.Page;

import com.sandeep.entities.Teacher;

public interface TeacherService {
	
	void addTeacher();
	
	Page<Teacher> getTeachers();

}
