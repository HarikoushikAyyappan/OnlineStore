package com.onlinestore.dao;

import com.onlinestore.model.Customer;
import com.onlinestore.model.Orders;
import com.onlinestore.model.Products;

import java.util.List;
import java.util.Optional;

public interface Dao {
    Customer getCustomerById(int customerId);
    List<Customer> getAllCustomers();
    List<Products> getAllProducts();
    Orders orderGetById(int orderId);
}
