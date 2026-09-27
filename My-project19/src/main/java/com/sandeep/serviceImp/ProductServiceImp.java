package com.sandeep.serviceImp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.sandeep.entities.Product;
import com.sandeep.repo.ProductRepo;
import com.sandeep.service.ProductService;

@Service
public class ProductServiceImp  implements ProductService{

	
	@Autowired
	private ProductRepo repo;
	
	
	
	@Override
	public void saveProduct() {
		
		List<Product> list=Arrays.asList(

			    new Product("Laptop", "Electronics", 50000),

			    new Product("Mouse", "Electronics", 1000),

			    new Product("Laptop", "Electronics", 70000),

			    new Product("Chair", "Furniture", 5000),

			    new Product("Laptop", "Electronics", 60000),

			    new Product("Keyboard", "Electronics", 2000),

			    new Product("Chair", "Furniture", 7000),

			    new Product("Mobile", "Electronics", 25000),

			    new Product("Laptop", "Computer", 80000),

			    new Product("Table", "Furniture", 9000)
				);
		repo.saveAll(list);
		
	}



	@Override
	public List<Product> searchProduct(Product product) {
		
		Example<Product> objj=Example.of(product);
		
		
		
		List<Product> obj=repo.findAll(objj);
		
		return obj;
	}
	
	
}
