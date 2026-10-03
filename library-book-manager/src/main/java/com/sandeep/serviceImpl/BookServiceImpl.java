package com.sandeep.serviceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandeep.entity.Book;
import com.sandeep.repository.BookRepository;
import com.sandeep.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	
	@Autowired
	private BookRepository repo;
	
	
	@Override
	public Book addBook(Book book) {		
		return repo.save(book);
	}
	

	@Override
	public List<Book> getAllBooks() {
		return repo.findAll();
	}

	
	@Override
	public Optional<Book> getBookById(Integer id) {
		return repo.findById(id);
	}
	

	@Override
	public void deleteBook(Integer id) {
		repo.deleteById(id);
		
	}

	@Override
	public List<Book> findByAuthor(String author) {
		return repo.findByAuthor(author);
	}

	@Override
	public List<Book> findByCategory(String category) {
		return repo.findByCategory(category);
	}

	
	@Override
	public List<Book> findByName(String name) {
		return repo.findByBookNameContainingIgnoreCase(name);
		
	}

	
	@Override
	public List<Book> findExpensiveBooks(double price) {
		
		return repo.findByPriceGreaterThan(price);
	}
	
	

}
