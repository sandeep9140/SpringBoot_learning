package com.sandeep.serviceImpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandeep.entities.Student;
import com.sandeep.repo.StudentRepo;
import com.sandeep.service.StudentService;
@Service
public class StudentServiceImpl  implements StudentService{

	@Autowired
	private StudentRepo repo;
	
	
	public void saveStudent() {
		
		List<Student> list=Arrays.asList(
				new Student("sandeep", 10),
				new Student("vijay", 13),
				new Student("pradeep", 140),
				new Student("ankit", 13),
				new Student("viashal", 40)
				);
		repo.saveAll(list);
		
		
	}
	

	@Override
	public List<Student> getDataByName(String name) {
		List<Student> obj=repo.dataGetByName(name);
		return obj;
	}


	
	
	@Override
	public List<Student> getDataByAge(int age) {
		List<Student> obj1=repo.datafatchByAge(age);
		return obj1;
	}
	
	
	
	
	
	

}
