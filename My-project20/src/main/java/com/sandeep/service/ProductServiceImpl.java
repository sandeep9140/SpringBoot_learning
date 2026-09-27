package com.sandeep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sandeep.entities.Product;
import com.sandeep.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;


    // Save Product
    @Override
    public Product saveProduct(Product product) {

        return productRepo.save(product);
    }


    // Get All Products
    @Override
    public List<Product> getAllProducts() {

        return productRepo.findAll();
    }


    // Search by Exact Name
    @Override
    public List<Product> searchByName(String name) {

        return productRepo.findByName(name);
    }


    // Search by Name OR Model
    @Override
    public List<Product> searchByNameOrModel(
            String name,
            String model) {

        return productRepo.findByNameOrModel(name, model);
    }


    // Search by Partial Name
    @Override
    public List<Product> searchByNameContaining(String name) {

        return productRepo.findByNameContaining(name);
    }


    // Pagination
    @Override
    public Page<Product> getProducts(
            int page,
            int size) {

        Pageable pageable =
                PageRequest.of(page, size);

        return productRepo.findAll(pageable);
    }


    // Pagination + Sorting
    @Override
    public Page<Product> getProductsSorted(
            int page,
            int size,
            String field) {

        Pageable pageable =
                PageRequest.of(
                        page,
                        size,
                        Sort.by(field).ascending()
                );

        return productRepo.findAll(pageable);
    }


    // Search + Pagination
    @Override
    public Page<Product> searchProducts(
            String name,
            int page,
            int size) {

        Pageable pageable =
                PageRequest.of(page, size);

        return productRepo.findByNameContaining(
                name,
                pageable
        );
    }
}