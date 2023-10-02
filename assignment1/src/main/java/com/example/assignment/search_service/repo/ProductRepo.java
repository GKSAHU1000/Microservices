package com.example.assignment.search_service.repo;

import com.example.assignment.cart_service.model.Cart;
import com.example.assignment.search_service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

    List<Product> findByName(String pname);
}
