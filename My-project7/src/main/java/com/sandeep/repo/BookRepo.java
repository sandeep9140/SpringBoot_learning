package com.sandeep.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sandeep.entities.Book;
@Repository
public interface BookRepo extends CrudRepository<Book, Integer> {

}
