package com.sandeep.serviceImpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandeep.entities.Course;
import com.sandeep.repo.CourseRepo;
import com.sandeep.service.CourseService;

@Service
public class CourseServiceImpl  implements CourseService{

	@Autowired
	private CourseRepo repo;
	@Override
	public void courseAdd() {
		
		List<Course> list=Arrays.asList(
				new Course("java", 200),
				new Course("python", 300),
				new Course("c++", 400),
				new Course("Hash", 100)
				);
		
		repo.saveAll(list);
		
		
	}
	@Override
	public void getCourseData(String mycname) {
		
		
		Course course=repo.getCourse(mycname);
		
		System.out.println(course.getId()+" "+course.getCname()+" "+course.getPrice());
		
	}
	
	
	
	

}
