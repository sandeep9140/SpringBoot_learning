package com.sandeep.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sandeep.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	@Query("select s from Student s where  s.name=:student_name")
	List<Student>  dataGetByName(@Param("student_name") String name);
	
	@Query(value = "SELECT * FROM Student WHERE student_age > :student_age",nativeQuery=true)
	List<Student>  datafatchByAge(@Param("student_age") int age);
	
	

}
