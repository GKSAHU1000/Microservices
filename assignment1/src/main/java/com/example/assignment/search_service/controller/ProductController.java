package com.example.assignment.search_service.controller;

import com.example.assignment.search_service.model.Product;
import com.example.assignment.search_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/SearchService")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.CREATED);
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProduct() {
        List<Product> products = productService.getProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/findbyid/{pid}")
    public ResponseEntity<Product> findByProductId(@PathVariable int pid) {
        return new ResponseEntity<>(productService.findProductbyId(pid), HttpStatus.OK);
    }

    @PostMapping("/findbyname/{pname}")
    public ResponseEntity<List<Product>> findByProductName(@PathVariable String pname) {
        return new ResponseEntity<>(productService.findByProductName(pname), HttpStatus.OK);
    }

}
