package com.sandeep.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandeep.service.entities.Book;

public interface BookRepository  extends JpaRepository<Book, Integer>{

}
