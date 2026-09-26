package com.sandeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;

import com.sandeep.entities.Teacher;
import com.sandeep.service.TeacherService;

@SpringBootApplication
public class MyProject14Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
		SpringApplication.run(MyProject14Application.class, args);
		
		
		TeacherService ts=ctx.getBean(TeacherService.class);
		
		//ts.addTeacher();
		
		Page<Teacher> pageList=ts.getTeachers();
		
		pageList.forEach(d->System.out.println(d.getId()+" "+d.getName()+" "+d.getRole()));
	}

}
