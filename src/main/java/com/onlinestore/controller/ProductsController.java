package com.onlinestore.controller;
import com.onlinestore.model.Customer;
import com.onlinestore.model.Products;
import com.onlinestore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsController {
    @Autowired
    ProductService productService;
    @GetMapping(value = "/productsList")
    public List<Products> getAllProducts(){
        return productService.getAllProducts();
    }
}
