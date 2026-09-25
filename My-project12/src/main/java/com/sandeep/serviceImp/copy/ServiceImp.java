package com.sandeep.serviceImp.copy;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandeep.entities.Student;
import com.sandeep.repo.StudentRepo;
import com.sandeep.service.StudentService;

@Service
public class ServiceImp implements StudentService {

	@Autowired
	private StudentRepo repo;

	@Override
	public void saveStudent() {
		
		List<Student> students=Arrays.asList(
				new Student("sandeep", 20),
				new Student("vijay", 32),
				new Student("ankit", 24),
				new Student("ankit sukla", 90),

				new Student("sandeep", 20),
				new Student("vijay", 32),
				new Student("ankit", 24),
				new Student("ankit sukla", 90)
				);
		
		repo.saveAll(students);
		
	}
	
	
	
	

}
