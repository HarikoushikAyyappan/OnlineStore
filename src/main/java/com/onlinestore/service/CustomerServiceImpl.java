package com.onlinestore.service;
import com.onlinestore.dao.Dao;
import com.onlinestore.model.Address;
import com.onlinestore.model.Admin;
import com.onlinestore.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    @Autowired
    Dao customerDao;
    public Customer customerGetById(int customerId){
        return customerDao.getCustomerById(customerId);
    }
    public List<Customer> getAllCustomers(){
        return customerDao.getAllCustomers();
    }
    public List<Admin> search(int adminId, String password){
        return customerDao.search(adminId,password);
    }
    public List<Customer> find(int customerId, String password){
        return customerDao.find(customerId,password);
    }
    public List<Address> getProfile(int addressId){
        return customerDao.getProfile(addressId);
    }
    public Customer updateCustomer(Customer customer){
        return customerDao.updateCustomer(customer);
    }
}
