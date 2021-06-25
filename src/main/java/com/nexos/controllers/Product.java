package com.nexos.controllers;

import com.nexos.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class Product {

    @Autowired
    private ProductService productService;

    @GetMapping("/getProducts")
    List<com.nexos.models.Product> getProduct() {
        return productService.getAll();
    }

    @PostMapping("/save")
    com.nexos.models.Product saveProduct(@RequestBody() com.nexos.models.Product product) {
        return productService.save(product);
    }
}
