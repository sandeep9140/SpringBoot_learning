package com.sandeep.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandeep.entities.Idcard;
import com.sandeep.entities.Student;
import com.sandeep.repo.StudentRepo;
import com.sandeep.service.StudentService;
@Service
public class ServiceImpl implements StudentService {

	@Autowired
	private StudentRepo repo;
	
	
	
	@Override
	public void deleteStudent(int id) {
		repo.deleteById(id);
		
	}



	@Override
	public void saveStudent() {
		
		Idcard idcard=new Idcard();
		idcard.setCname("sandeep");
		idcard.setRollno("10");
		
		
		//student prapare
		
		Student std=new Student();
		std.setName("sandeep");
		std.setAddress("mumbai");
		std.setIdcard(idcard);
		
		
		repo.save(std);
		
		
		
		
	}
	

}
