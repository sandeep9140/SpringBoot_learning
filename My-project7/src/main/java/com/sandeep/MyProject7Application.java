package com.sandeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sandeep.entities.Book;
import com.sandeep.service.BookService;

@SpringBootApplication
public class MyProject7Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
		SpringApplication.run(MyProject7Application.class, args);
		
		BookService b=context.getBean(BookService.class);
		
		
		Book buk=new Book(101,"java book", "sandeep");
		b.saveBook(buk);
		
		
	}

}
