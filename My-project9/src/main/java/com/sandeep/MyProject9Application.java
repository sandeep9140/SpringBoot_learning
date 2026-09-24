package com.sandeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sandeep.entities.Employee;
import com.sandeep.entities.Manager;
import com.sandeep.service.EmployeeService;
import com.sandeep.service.ManagerServic;

@SpringBootApplication
public class MyProject9Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
		SpringApplication.run(MyProject9Application.class, args);
		
		EmployeeService emps=context.getBean(EmployeeService.class);
		
		Employee emp=new Employee(111,"sandeep","mumbai");
		
		emps.saveEmployee(emp);
		
		
		//manager works here 
		
		ManagerServic ms=context.getBean(ManagerServic.class);
		
		Manager m=new Manager(1200,"sundar lala");
		
		ms.addManager(m);
		
		
		
	}

}
