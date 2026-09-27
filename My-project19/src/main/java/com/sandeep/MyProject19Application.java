package com.sandeep;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sandeep.entities.Product;
import com.sandeep.service.ProductService;

@SpringBootApplication
public class MyProject19Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx =
                SpringApplication.run(MyProject19Application.class, args);

        ProductService obj = ctx.getBean(ProductService.class);

        // Save products
        obj.saveProduct();

        // QBE Search
        Product pr = new Product();
        pr.setName("Laptop");

        List<Product> products = obj.searchProduct(pr);

        System.out.println("===== QBE RESULT =====");

        for (Product p : products) {
            System.out.println(
                p.getId() + " | " +
                p.getName() + " | " +
                p.getCategory() + " | " +
                p.getPrice()
            );
        }
    }
}