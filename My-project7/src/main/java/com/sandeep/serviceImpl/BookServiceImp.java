package com.sandeep.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandeep.entities.Book;
import com.sandeep.repo.BookRepo;
import com.sandeep.service.BookService;

@Service
public class BookServiceImp  implements BookService{
	
	@Autowired
	private BookRepo repo;
	@Override
	public Book saveBook(Book book) {
		Book saveData=repo.save(book);
		return saveData;
	}

}
