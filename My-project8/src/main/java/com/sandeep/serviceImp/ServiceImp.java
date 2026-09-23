package com.sandeep.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandeep.entities.Students;
import com.sandeep.repo.StudentRepo;
import com.sandeep.service.StudentService;
@Service
public class ServiceImp  implements StudentService{
	
	@Autowired
	private StudentRepo repo;
	@Override
	public Students saveStudent(Students student) {
		Students saveData=repo.save(student);
		
		
		return saveData;
	}

}
