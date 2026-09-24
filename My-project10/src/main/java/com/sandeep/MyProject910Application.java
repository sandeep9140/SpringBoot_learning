package com.sandeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sandeep.entities.Employee;
import com.sandeep.service.EmployeeService;

@SpringBootApplication
public class MyProject910Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
		SpringApplication.run(MyProject910Application.class, args);
		
		EmployeeService es=context.getBean(EmployeeService.class);
		
		Employee emp=new Employee("sandeep",12344);	
		
		es.saveEmployee(emp);
		
		es.deleteEmployee(2);
		
		
	}

}
