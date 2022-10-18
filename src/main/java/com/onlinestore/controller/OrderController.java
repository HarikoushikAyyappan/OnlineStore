package com.onlinestore.controller;

import com.onlinestore.model.Customer;
import com.onlinestore.model.Orders;
import com.onlinestore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @GetMapping(value = "/getOrder/{orderId}")
    public Orders orderGetById(@PathVariable int orderId)  {
        return orderService.orderGetById(orderId);
    }
}
