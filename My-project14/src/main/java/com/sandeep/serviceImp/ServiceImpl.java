package com.sandeep.serviceImp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sandeep.entities.Teacher;
import com.sandeep.repo.TeacherRepo;
import com.sandeep.service.TeacherService;

@Service
public class ServiceImpl implements TeacherService {

	
	@Autowired
	private TeacherRepo repo;
	@Override
	public void addTeacher() {
		
		List<Teacher> list=Arrays.asList(
				new Teacher("sandeep", "devloper"),
				new Teacher("vijay", "r"),
				new Teacher("annu", "evloper"),
				new Teacher("ankit", "vloper"),
				new Teacher("vishal", "oper"),
				new Teacher("ravi", "per"),
				new Teacher("kishan", "r"),
				new Teacher("vinit", "evloper"),
				new Teacher("ajay", "vloper"),
				new Teacher("sanchit", "oper"),
				new Teacher("vishnu", "per"),
				new Teacher("tiwari", "er")
				);
		
		repo.saveAll(list);
		
		
	}
	@Override
	public Page<Teacher> getTeachers() {
		
		Pageable pageable=PageRequest.of(1, 4,Sort.by("name").ascending());
		
		Page<Teacher> page=repo.findAll(pageable);
		
		return page;
	}
	

}
