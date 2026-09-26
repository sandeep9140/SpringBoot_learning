package com.sandeep;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;

import com.sandeep.entities.Product;
import com.sandeep.service.ProductService;

@SpringBootApplication
public class MyProject15Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
		SpringApplication.run(MyProject15Application.class, args);
		
		
		ProductService obj=ctx.getBean(ProductService.class);
		
		obj.saveProduct();
		
		Page<Product> page=obj.paginationMethod();
		
		page.forEach(d->System.out.println(d.getId()+" "+d.getProductName()+" "+d.getPrice()));
		
		System.out.println("Current page Number : "+(page.getNumber()+1));// +1 because of start with 1 
		
		System.out.println("current page total element show : "+page.getNumberOfElements());
		
		System.out.println("each page number records : "+page.getSize());
		System.out.println("total records : "+page.getTotalElements());
		System.out.println("show all record in form of list  : "+page.getContent());
		System.out.println("total pages : "+page.getTotalPages());
	
	}

}
