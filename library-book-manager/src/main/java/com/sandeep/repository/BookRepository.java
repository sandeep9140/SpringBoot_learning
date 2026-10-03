package com.sandeep.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sandeep.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	
	
	List<Book> findByAuthor(String author);
	
	List<Book> findByCategory(String category);
	
	List<Book> findByBookNameContainingIgnoreCase(String bookName);
	
	List<Book> findByPriceGreaterThan(double price);
	
	List<Book> findByPriceLessThan(double price);
	
	List<Book> findByPriceBetween(double min, double max);

	

}
