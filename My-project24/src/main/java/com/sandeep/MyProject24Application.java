package com.sandeep;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sandeep.entities.Student;
import com.sandeep.service.StudentService;

@SpringBootApplication
public class MyProject24Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
		SpringApplication.run(MyProject24Application.class, args);
		
		
		StudentService ss=ctx.getBean(StudentService.class);
		
		//ss.saveStudent();
		
		List<Student> obj=ss.getDataByName("sandeep");
		obj.forEach(d->System.out.println(d.getId()+" "+d.getName()+" "+d.getAge()));
		
		
		
		System.out.println("===================================================================");
		
		List<Student> obj1=ss.getDataByAge(1);
		obj1.forEach(d->System.out.println(d.getId()+" "+d.getName()+" "+d.getAge()));
	}

}
