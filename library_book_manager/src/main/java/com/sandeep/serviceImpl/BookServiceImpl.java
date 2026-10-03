package com.sandeep.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandeep.repo.BookRepository;
import com.sandeep.service.BookService;
import com.sandeep.service.entities.Book;
@Service
public class BookServiceImpl  implements BookService{

	
	@Autowired
	private BookRepository repo;
	
	@Override
	public Book addBook(Book book) {
		return repo.save(book);
	}

	@Override
	public Book getBookById(Integer id) {
		return repo.findById(id).orElseThrow(() -> new RuntimeException("Book not found with id : "+id));
		
	}

	@Override
	public List<Book> getAllBooks() {
		
		return repo.findAll();
	}



	@Override
	public void deleteBook(Integer id) {
		repo.deleteById(id);
		
	}
	
	

}
