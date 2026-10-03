package com.sandeep;



import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sandeep.entity.Book;
import com.sandeep.service.BookService;

@SpringBootApplication
public class LibraryBookManagerApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx=
		SpringApplication.run(LibraryBookManagerApplication.class, args);
		
		BookService bs=ctx.getBean(BookService.class);
		
		Book b1 = new Book(
		        "Java Complete Reference",
		        "Herbert Schildt",
		        799,
		        "Programming"
		);

		Book b2 = new Book(
		        "Effective Java",
		        "Joshua Bloch",
		        950,
		        "Programming"
		);

		Book b3 = new Book(
		        "Clean Code",
		        "Robert Martin",
		        850,
		        "Software Engineering"
		);

		Book b4 = new Book(
		        "Spring in Action",
		        "Craig Walls",
		        1100,
		        "Spring"
		);

		Book b5 = new Book(
		        "Head First Java",
		        "Kathy Sierra",
		        700,
		        "Programming"
		);
//
//		bs.addBook(b1);
//		bs.addBook(b2);
//		bs.addBook(b3);
//		bs.addBook(b4);
//		bs.addBook(b5);
		
		
		List<Book> bookss=bs.getAllBooks();
		
		bookss.forEach(d->System.out.println("book name :  "+d.getBookName()));
		
		System.out.println("\nbooks print\n");
		
		bs.deleteBook(1);
		
		
		System.out.println("\nbooks by name print\n");
		
		List<Book> nameBook=bs.findByCategory("Java");
		nameBook.forEach(d->System.out.println(d.getBookName()));
		
		
		
		
	}

}
