package com.sandeep;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sandeep.entities.Employee;
import com.sandeep.service.EmployeeService;

@SpringBootApplication
public class MyProject11Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
		SpringApplication.run(MyProject11Application.class, args);
		
		EmployeeService emps=ctx.getBean(EmployeeService.class);
		
		//emps.saveEmployees();
		
		List<Employee> le=emps.getAllEmployee();
		
		le.forEach(d->System.out.println(" "+d.getId()+" "+d.getName()+" "+d.getAge()+" "+d.getClass()+"\n"));
	}

}
