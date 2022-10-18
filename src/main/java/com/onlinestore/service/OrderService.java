package com.onlinestore.service;

import com.onlinestore.model.Customer;
import com.onlinestore.model.Orders;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    Orders orderGetById(int orderId);
}
