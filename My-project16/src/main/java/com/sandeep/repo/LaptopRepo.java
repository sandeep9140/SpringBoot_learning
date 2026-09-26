package com.sandeep.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sandeep.entities.Laptop;
import java.util.List;


@Repository
public interface LaptopRepo  extends JpaRepository<Laptop, Integer>{
	
	List<Laptop> findByName(String name);
	
	List<Laptop> findByNameOrModel(String name,int model);
	
	List<Laptop> findByModelGreaterThan(int model);
	
	List<Laptop> findBynameStartingWith(String name);
	
	
	
	List<Laptop> findByNameOrderByModelAsc(String name);
	
	List<Laptop> findTop3ByModelGreaterThan(int model);
	
	
	
	
	
	
	
	

}
