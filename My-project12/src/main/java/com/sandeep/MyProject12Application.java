package com.sandeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sandeep.service.StudentService;

@SpringBootApplication
public class MyProject12Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx =
                SpringApplication.run(MyProject12Application.class, args);

        StudentService service = ctx.getBean(StudentService.class);

        service.saveStudent();
    }
}