package com.sandeep.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import com.sandeep.demo.controller.Cont;
import com.sandeep.demo.service.Serv;
import com.vijju.Outer;

@SpringBootApplication
@ComponentScans({
	@ComponentScan("com.sandeep.demo"),
	@ComponentScan("com.vijju")
})
public class MyProject2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(MyProject2Application.class, args);
		System.out.println("running root file re baba");
		
		Dada d=context.getBean(Dada.class);
		d.dada();
		
		Serv s=context.getBean(Serv.class);
		s.serv();
		
		Cont c=context.getBean(Cont.class);
		c.cont();
		
		Outer o=context.getBean(Outer.class);
		o.oute();
		
		
	}

}
