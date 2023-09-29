package com.example.assignment.order_service.repo;

import com.example.assignment.cart_service.model.Cart;
import com.example.assignment.order_service.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Orders,Integer> {
}
