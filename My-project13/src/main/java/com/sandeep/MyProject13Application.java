package com.sandeep;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sandeep.entities.Student;
import com.sandeep.service.SrudentService;

@SpringBootApplication
public class MyProject13Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
		SpringApplication.run(MyProject13Application.class, args);
		
		SrudentService ss=ctx.getBean(SrudentService.class);
		
		
		//ss.saveStudents();
		
		List<Student> listData=ss.getAllStudent();
		
		listData.forEach(d->System.out.println(d.getId()+"  "+d.getName()+"  "+d.getAge()));
		
		
		//==========================================================
		
		ss.deleteStudent();
		
		//==========================================================
		
		long pura=ss.countRecord();
		
		System.out.println("pura record hao jo databse me :  "+pura);
	}

}
