package com.onlinestore.service;
import com.onlinestore.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    Customer customerGetById(int customerId);
    List<Customer> getAllCustomers();
}
