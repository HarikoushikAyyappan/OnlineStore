package com.onlinestore.repository;
import com.onlinestore.model.Admin;
import com.onlinestore.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    @Query(value = "SELECT c FROM Customer c WHERE c.customerId=?1 AND c.password=?2")
    List<Customer> find(@Param("customerId") int customerId, @Param("password") String password);
}
