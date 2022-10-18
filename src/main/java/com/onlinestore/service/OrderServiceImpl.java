package com.onlinestore.service;

import com.onlinestore.dao.Dao;
import com.onlinestore.model.Customer;
import com.onlinestore.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements OrderService {
    @Autowired
    Dao customerDao;
   public Orders orderGetById(int orderId){
        return customerDao.orderGetById(orderId);
    }
}
