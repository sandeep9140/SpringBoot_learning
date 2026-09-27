package com.sandeep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sandeep.entities.Product;
import com.sandeep.service.ProductService;

@SpringBootApplication
public class MyProject20Application implements CommandLineRunner {

    @Autowired
    private ProductService productService;

    public static void main(String[] args) {

        SpringApplication.run(MyProject20Application.class, args);
    }

    @Override
    public void run(String... args) {

        Product p1 =
                new Product("Dell Laptop", "Inspiron 15", 55000);

        Product p2 =
                new Product("HP Laptop", "Pavilion", 60000);

        Product p3 =
                new Product("Lenovo Laptop", "IdeaPad", 48000);

        Product p4 =
                new Product("Asus Laptop", "Vivobook", 52000);

        Product p5 =
                new Product("Acer Laptop", "Aspire 5", 45000);


        productService.saveProduct(p1);
        productService.saveProduct(p2);
        productService.saveProduct(p3);
        productService.saveProduct(p4);
        productService.saveProduct(p5);


        System.out.println("================================");
        System.out.println("      PRODUCTS FROM DATABASE");
        System.out.println("================================");

        productService.getAllProducts()
                .forEach(product -> {

                    System.out.println(
                            product.getId()
                            + " | "
                            + product.getName()
                            + " | "
                            + product.getModel()
                            + " | ₹"
                            + product.getPrice()
                    );
                });
    }
}