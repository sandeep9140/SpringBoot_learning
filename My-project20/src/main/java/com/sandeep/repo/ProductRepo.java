package com.sandeep.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sandeep.entities.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    List<Product> findByName(String name);

    List<Product> findByNameOrModel(String name, String model);

    List<Product> findByNameContaining(String name);

    Page<Product> findByNameContaining(String name, Pageable pageable);
}