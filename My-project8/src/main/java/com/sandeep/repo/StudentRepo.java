package com.sandeep.repo;

import org.springframework.data.repository.CrudRepository;

import com.sandeep.entities.Students;

public interface StudentRepo extends CrudRepository<Students, Integer> {
	
	

}



