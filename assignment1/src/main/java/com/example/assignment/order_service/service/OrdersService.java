package com.example.assignment.order_service.service;

import com.example.assignment.cart_service.repo.CartRepo;
import com.example.assignment.order_service.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {
    @Autowired
    OrderRepo orderRepo;



}
