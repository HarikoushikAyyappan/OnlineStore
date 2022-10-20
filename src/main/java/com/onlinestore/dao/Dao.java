package com.onlinestore.dao;

import com.onlinestore.model.*;

import java.util.List;
import java.util.Optional;

public interface Dao {
    Customer getCustomerById(int customerId);
    List<Customer> getAllCustomers();
    List<Products> getAllProducts();
    Orders orderGetById(int orderId);
    List<Admin> search(int adminId, String password);
    List<Customer> find(int customerId, String password);
    List<Orders> get(int customerId);
    List<Address> getProfile(int addressId);
    Products getProducts(int  productId);
    Products update(Products products);
    Customer updateCustomer(Customer customer);
}
