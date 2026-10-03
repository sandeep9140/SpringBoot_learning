package com.sandeep;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sandeep.service.BookService;
import com.sandeep.service.entities.Book;

@SpringBootApplication
public class LibraryBookManagerApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx=
		SpringApplication.run(LibraryBookManagerApplication.class, args);
		
		
		BookService bs=ctx.getBean(BookService.class);
		
		Book book=new Book();
		
		book.setTitle("java");
		book.setQuantity(4);
		book.setPrice(100);
		
		Book book1=new Book();
		
		book1.setTitle("java");
		book1.setQuantity(4);
		book1.setPrice(100);
		
		Book book2=new Book();
		
		book2.setTitle("java");
		book2.setQuantity(4);
		book2.setPrice(100);
		
		Book book3=new Book();
		
		book3.setTitle("java");
		book3.setQuantity(4);
		book3.setPrice(100);
		
		
//		bs.addBook(book);
//		bs.addBook(book1);
//		bs.addBook(book2);
//		bs.addBook(book3);
//		
		//=====================================
		
		Book bok=bs.getBookById(2);
		System.out.println(bok.getTitle()+" "+bok.getPrice()+" "+bok.getQuantity());
		
		//===================================
		System.out.println("get all book===============");
		
	List<Book> bok2=bs.getAllBooks();
	bok2.forEach(d->System.out.println(d.getTitle()+" "+d.getPrice()+" "+d.getQuantity()));
	
	
	System.out.println("delete book===============");
	bs.deleteBook(3);
		
		
	}

}
