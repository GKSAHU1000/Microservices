package com.example.assignment.cart_service.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Cart")
public class Cart {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToMany
    private List<Product> cartProduct;

}
