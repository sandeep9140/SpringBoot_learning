package com.sandeep.service;

import java.util.List;

import com.sandeep.service.entities.Book;

public interface BookService {
	
	Book addBook(Book book);
	
	Book getBookById(Integer id);
	
	List<Book> getAllBooks();
	
	
	
	void deleteBook(Integer id);
}
