package com.onlinestore.repository;

import com.onlinestore.model.Orders;
import com.onlinestore.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Integer> {
}
