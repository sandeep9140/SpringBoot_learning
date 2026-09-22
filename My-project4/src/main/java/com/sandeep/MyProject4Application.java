package com.sandeep;





import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sandeep.controller.MyController;
import com.sandeep.repository.MyRepo;
import com.sandeep.service.MyService;


@SpringBootApplication
public class MyProject4Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(MyProject4Application.class, args);
		
		
		 //ConfigurableApplicationContext context=SpringApplication.run(MyProject4Application.class, args);
		 
		MyController mc=context.getBean(MyController.class);
		mc.con();
		
		MyRepo mr=context.getBean(MyRepo.class);
		mr.rep();
		
		MyService ms=context.getBean(MyService.class);
		ms.ser();
	}

}
