package com.sandeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sandeep.service.StudentService;

@SpringBootApplication
public class JpaProject27Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
		SpringApplication.run(JpaProject27Application.class, args);
		
		
		StudentService ss=ctx.getBean(StudentService.class);
		ss.saveStudent();
		
		ss.deleteStudent(1);
	}

}
