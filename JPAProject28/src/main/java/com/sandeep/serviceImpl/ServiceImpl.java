package com.sandeep.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sandeep.entities.Student;
import com.sandeep.repo.StudentRepo;
import com.sandeep.service.StudentService;

@Service
public class ServiceImpl implements StudentService {

	@Autowired
	private StudentRepo repo;
	
	@Override
	@Transactional
	public void saveStudent() {
		Student s1=new Student();
		
		s1.setName("sandeep");
		s1.setAge(20);
		
		
		repo.save(s1);
		
		
		//student 2
		
		Student s2=new Student();
		s2.setName("vijay");
		s2.setAge(33);
		
		repo.save(s2);
		
		
	}
	

}
