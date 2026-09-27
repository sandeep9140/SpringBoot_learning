package com.sandeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sandeep.service.CourseService;

@SpringBootApplication
public class MyProject23Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
		SpringApplication.run(MyProject23Application.class, args);
		
		CourseService beanObj=ctx.getBean(CourseService.class);
		
		//beanObj.courseAdd();
		
		beanObj.getCourseData("java");
	}

}
