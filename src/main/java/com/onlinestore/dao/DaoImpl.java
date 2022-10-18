package com.onlinestore.dao;
import com.onlinestore.model.Customer;
import com.onlinestore.model.Orders;
import com.onlinestore.model.Products;
import com.onlinestore.repository.CustomerRepository;
import com.onlinestore.repository.OrderRepository;
import com.onlinestore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class DaoImpl implements Dao{
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OrderRepository orderRepository;

@Transactional
public Customer getCustomerById(int customerId){
    return customerRepository.findById(customerId).get();
    }
    @Transactional
    public List<Customer> getAllCustomers(){
        return (List<Customer>)customerRepository.findAll();
    }
    @Transactional
    public List<Products> getAllProducts(){
        return (List<Products>)productRepository.findAll();
    }
    @Transactional
    public Orders orderGetById(int orderId){
        return orderRepository.findById(orderId).get();

    }
}
