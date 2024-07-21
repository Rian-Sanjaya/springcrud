package com.lonedev.srpingCrud.services;

import com.lonedev.srpingCrud.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
