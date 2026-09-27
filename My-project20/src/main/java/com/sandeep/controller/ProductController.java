package com.sandeep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sandeep.entities.Product;
import com.sandeep.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("products",
                productService.getAllProducts());

        return "products";
    }

    @PostMapping("/save")
    public String saveProduct(Product product) {

        productService.saveProduct(product);

        return "redirect:/";
    }
}