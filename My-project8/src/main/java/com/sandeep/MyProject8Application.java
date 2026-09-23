package com.sandeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sandeep.entities.Students;
import com.sandeep.service.StudentService;

@SpringBootApplication
public class MyProject8Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
		SpringApplication.run(MyProject8Application.class, args);
		
		StudentService ss=context.getBean(StudentService.class);
		
		
		Students s=new Students(105,"sandeep ","vijay nager");
		ss.saveStudent(s);
	}

}
