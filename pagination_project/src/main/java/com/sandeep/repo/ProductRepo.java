package com.sandeep.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandeep.entities.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
