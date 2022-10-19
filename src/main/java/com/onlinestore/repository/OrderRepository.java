package com.onlinestore.repository;

import com.onlinestore.model.Customer;
import com.onlinestore.model.Orders;
import com.onlinestore.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Orders, Integer> {
    @Query(value = "SELECT c FROM Orders c WHERE c.customerId=?1 ")
    List<Orders> get(@Param("customerId") int customerId);
}
