package com.example.assignment.search_service.service;

import com.example.assignment.cart_service.repo.CartRepo;
import com.example.assignment.search_service.model.Product;
import com.example.assignment.search_service.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    public Product findProductbyId(int pid) {
        return productRepo.findById(pid).orElse(null);
    }

    public List<Product> findByProductName(String pname) {
        return productRepo.findByName(pname);
    }

    public Product updateProduct(Product product) {
        return productRepo.save(product);
    }


    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }


}
