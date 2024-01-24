package com.ciphercru.productservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @PostMapping
    public String createProduct(){
        return "Product created";
    }
    @GetMapping
    public String getProduct(){
        return "Getting Product";
    }

    @PutMapping
    public String updateProduct(){
        return "Product updated";
    }
    @DeleteMapping
    public String deleteProduct(){
        return "Product deleted";
    }


}
