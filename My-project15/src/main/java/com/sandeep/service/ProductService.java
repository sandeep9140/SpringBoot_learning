package com.sandeep.service;

import org.springframework.data.domain.Page;

import com.sandeep.entities.Product;


public interface ProductService {
	
	void saveProduct();
	
	Page<Product> paginationMethod();

}
