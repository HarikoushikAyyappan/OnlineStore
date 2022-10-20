package com.onlinestore.dao;
import com.onlinestore.model.*;
import com.onlinestore.repository.*;
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
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private CustomerProfileRepository customerProfileRepository;
    @Autowired
    private NewCustomerRepository newCustomerRepository;

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
    @Transactional
    public List<Admin> search(int adminId, String password) {
        return adminRepository.search(adminId,password);
    }
    @Transactional
    public List<Customer> find(int customerId, String password) {
        return customerRepository.find(customerId,password);
    }
    @Transactional
    public List<Orders> get(int customerId){
        return orderRepository.get(customerId);
    }
    @Transactional
    public List<Address> getProfile(int addressId){
    return customerProfileRepository.getProfile(addressId);
    }
    @Transactional
    public Products getProducts(int  productId) {
        return productRepository.findById(productId).get();
    }
    @Transactional
    public Products update(Products products) {
        return productRepository.save(products);


    }
    @Transactional
    public Customer updateCustomer(Customer customer) {
        return newCustomerRepository.save(customer);


    }

}
