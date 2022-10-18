package com.onlinestore.controller;
import com.onlinestore.model.Customer;
import com.onlinestore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping(value = "/getCustomer/{customerId}")
    public Customer customerGetById(@PathVariable int customerId)  {
        return customerService.customerGetById(customerId);
    }
    @GetMapping(value = "/customerList")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

}
