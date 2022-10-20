package com.onlinestore.service;

import com.onlinestore.dao.Dao;
import com.onlinestore.model.Customer;
import com.onlinestore.model.Products;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Autowired
    Dao customerDao;
    public List<Products> getAllProducts(){
        return customerDao.getAllProducts();
    }
    public Products getProducts(int  productId){
        return customerDao.getProducts(productId);
    }
    public Products update(Products products){
        return customerDao.update(products);
    }
}
