package com.sandeep.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sandeep.entities.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>{
	@Query("select  c from Course c where c.cname=:mycname")
	Course getCourse(String mycname);
	

}
