package com.sandeep;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sandeep.service.LaptopService;

@SpringBootApplication
public class MyProject16Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
		SpringApplication.run(MyProject16Application.class, args);
		
		LaptopService obj=ctx.getBean(LaptopService.class);
		
		//obj.saveLaptop();
		
		//obj.findProductByName("redmi");
		
		
		//obj.findLaptopByNameOrModel("redmi", 1);
		
		//obj.findLaptopByModelGreaterThan(5);
		
		
		//obj.findLaptopByNameStartingWith("s");
		
		System.out.println("Model ke base pe orderd  records");
		
		obj.findProductOrderByModel("sumsung");
		
		System.out.println("Model ke base pe top 3 records");
		
		obj.findProductTop3ByModel(4);
	}

}
