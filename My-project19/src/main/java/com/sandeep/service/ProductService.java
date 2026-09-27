package com.sandeep.service;

import java.util.List;

import com.sandeep.entities.Product;

public interface ProductService {
	
	void saveProduct();

	List<Product> searchProduct(Product product);
}
