package com.sandeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sandeep.entities.Employee;
import com.sandeep.service.EmployeeService;

@SpringBootApplication
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx=
		SpringApplication.run(EmployeeManagementApplication.class, args);
		
		EmployeeService es=ctx.getBean(EmployeeService.class);
        // =========================
        // 1. INSERT EMPLOYEES
        // =========================

        Employee e1 = new Employee(
                "Rahul Sharma",
                "rahul@gmail.com",
                "IT",
                65000,
                "Java Developer"
        );

        Employee e2 = new Employee(
                "Aman Verma",
                "aman@gmail.com",
                "HR",
                50000,
                "HR Executive"
        );

        Employee e3 = new Employee(
                "Priya Singh",
                "priya@gmail.com",
                "IT",
                80000,
                "Senior Developer"
        );

        Employee e4 = new Employee(
                "Neha Gupta",
                "neha@gmail.com",
                "Finance",
                70000,
                "Accountant"
        );

        Employee e5 = new Employee(
                "Rohit Kumar",
                "rohit@gmail.com",
                "IT",
                90000,
                "Backend Developer"
        );
//
//        es.addEmployee(e1);
//        es.addEmployee(e2);
//        es.addEmployee(e3);
//        es.addEmployee(e4);
//        es.addEmployee(e5);
        
        es.deleteEmployee(3);


	}

}
