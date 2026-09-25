package com.sandeep.serviceImp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sandeep.entities.Student;
import com.sandeep.repo.StudentRepo;
import com.sandeep.service.SrudentService;

@Service
public class ServiceImpl implements SrudentService{

	@Autowired
	private StudentRepo repo;
	
	@Override
	public void saveStudents() {
		List<Student> list=Arrays.asList(
				new Student("Sandeep", 21),
				new Student("vijay", 20),
				new Student("pradeep", 210),
				new Student("ankit", 22),
				new Student("ajay", 23),
				new Student("guddu", 10),
				new Student("anil", 21),
				new Student("pooja", 30),
				new Student("johney", 20),
				new Student("krishna ", 24),
				new Student("Sallu", 20),
				new Student("tipu sultan", 20)
				
				);
		repo.saveAll(list);
		
		
	}

	@Override
	public List<Student> getAllStudent() {
		
		List<Student> list=repo.findAll(Sort.by("name").ascending());
		return list;
	}

	@Override
	public void deleteStudent() {
		repo.deleteById(2);
		
	}

	@Override
	public long countRecord() {
		long countData=repo.count();
		return countData;
	}
	
	
	
	//=================================
	
	
	
	
	
	
	
	
	
	

}
