package com.example.assignment.order_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Orders {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date orderDate;

    @OneToMany
    private List<Product> ordersProduct;
}
