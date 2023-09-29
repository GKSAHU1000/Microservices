package com.example.assignment.cart_service.controller;


import com.example.assignment.cart_service.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/cart_service")
public class CartController {
    @Autowired
    CartService cartService;


}
