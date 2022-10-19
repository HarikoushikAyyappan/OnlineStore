package com.onlinestore.service;

import com.onlinestore.model.Customer;
import com.onlinestore.model.Orders;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    Orders orderGetById(int orderId);
    List<Orders> get(int customerId);
}
