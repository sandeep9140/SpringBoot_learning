package com.sandeep.service;


import java.util.List;
import java.util.Optional;

import com.sandeep.entity.Book;

public interface BookService {
	
	Book addBook(Book book);
	
	List<Book> getAllBooks();
	
	Optional<Book> getBookById(Integer id);
	
	void deleteBook(Integer id);
	
	List<Book>  findByAuthor(String author);
	
	List<Book> findByCategory(String category);
	
	List<Book> findByName(String name);
	
	List<Book>  findExpensiveBooks(double price);

}
