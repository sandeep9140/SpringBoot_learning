package com.sandeep.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sandeep.entities.Product;


@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
