package com.onlinestore.service;
import com.onlinestore.model.Admin;
import com.onlinestore.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    Customer customerGetById(int customerId);
    List<Customer> getAllCustomers();
    List<Admin> search(int adminId, String password);
    List<Customer> find(int customerId, String password);
}
