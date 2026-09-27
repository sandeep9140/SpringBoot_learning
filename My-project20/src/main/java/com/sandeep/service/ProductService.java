package com.sandeep.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.sandeep.entities.Product;

public interface ProductService {

    Product saveProduct(Product product);

    List<Product> getAllProducts();

    List<Product> searchByName(String name);

    List<Product> searchByNameOrModel(String name, String model);

    List<Product> searchByNameContaining(String name);

    Page<Product> getProducts(int page, int size);

    Page<Product> getProductsSorted(int page, int size, String field);

    Page<Product> searchProducts(
            String name,
            int page,
            int size);
}