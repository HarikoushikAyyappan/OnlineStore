package com.onlinestore.dao;
import com.onlinestore.model.Admin;
import com.onlinestore.model.Customer;
import com.onlinestore.model.Orders;
import com.onlinestore.model.Products;
import com.onlinestore.repository.AdminRepository;
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
    @Autowired
    private AdminRepository adminRepository;

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
    public List<Customer> findId(int customerId, String password) {
        return customerRepository.find(customerId,password);
    }
    @Transactional
    public List<Orders> get(int customerId){
        return orderRepository.get(customerId);
    }
}
