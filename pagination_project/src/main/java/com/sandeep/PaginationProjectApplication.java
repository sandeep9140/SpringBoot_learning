package com.sandeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;

import com.sandeep.entities.Product;
import com.sandeep.service.ProductService;

@SpringBootApplication
public class PaginationProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
		SpringApplication.run(PaginationProjectApplication.class, args);
		
		
		ProductService ps=ctx.getBean(ProductService.class);
		
		ps.saveProduct();
		
		Page<Product> page=ps.paginationMethod();
		
		page.forEach(d->System.out.println(d.getId()+" "+d.getProductName()+" "+d.getPrice()));
		
		System.out.println(page.getNumber()+1);
		
		System.out.println(page.getNumberOfElements());
		
		System.out.println(page.getSize());
		
		System.out.println(page.getTotalElements());
		System.out.println(page.getTotalPages());
		System.out.println(page.getContent());
		
	}

}
