package com.sandeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sandeep.entities.Student;
import com.sandeep.service.StudentService;

@SpringBootApplication
public class MyProject18Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
		SpringApplication.run(MyProject18Application.class, args);
		
		StudentService ss=ctx.getBean(StudentService.class);
		
		//ss.saveStudents();
		
		
		Student obj=new Student();
		obj.setName("pooja");
		
		
		
		ss.getStudent(obj);
	}

}
