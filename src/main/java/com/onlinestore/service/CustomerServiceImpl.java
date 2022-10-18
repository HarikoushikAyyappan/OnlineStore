package com.onlinestore.service;
import com.onlinestore.dao.Dao;
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
}
