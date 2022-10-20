package com.onlinestore.service;

import com.onlinestore.model.Customer;
import com.onlinestore.model.Products;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {
    List<Products> getAllProducts();
    Products getProducts(int  productId);
    Products update(Products products);
}
