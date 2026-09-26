package com.sandeep.serviceImp;

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
public class ServiceImp  implements ProductService{

	@Autowired
	private ProductRepo repo;
	@Override
	public void saveProduct() {
		
		List<Product> list=Arrays.asList(

				new Product("sandeep", 2000),
				new Product("vijay", 100),
				new Product("ankit", 12000),
				new Product("ajay", 12010),
				new Product("neeraj", 11200),
				new Product("vijany", 12200),
				new Product("akshit", 12200),
				new Product("raj", 12200),
				new Product("katrina", 12200)
				
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
