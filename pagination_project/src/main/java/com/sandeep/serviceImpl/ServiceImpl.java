package com.sandeep.serviceImpl;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sandeep.entities.Product;
import com.sandeep.repo.ProductRepo;
import com.sandeep.service.ProductService;

@Service
public class ServiceImpl implements ProductService{

	
	@Autowired
	private ProductRepo repo;
	
	@Override
	public void saveProduct() {
		
		List<Product> list=Arrays.asList(
				new Product("laptop", 100),
				new Product("phone", 200),
				new Product("headphone", 1300),
				new Product("chargr", 1100),
				new Product("kela", 1009),
				new Product("top", 1005),
				new Product("lapta", 4100)
				
				);
		repo.saveAll(list);
		
	}

	
	@Override
	public Page<Product> paginationMethod() {
		Pageable pageable=PageRequest.of(0, 4, Sort.by("productName").ascending());
		
		Page<Product> page=repo.findAll(pageable);
		return page;
	}
	
	

}
