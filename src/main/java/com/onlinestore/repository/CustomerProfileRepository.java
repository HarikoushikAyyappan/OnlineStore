
package com.onlinestore.repository;

import com.onlinestore.model.Address;
import com.onlinestore.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerProfileRepository extends JpaRepository<Address, Integer> {

    @Query(value = "SELECT c FROM Address c WHERE c.addressId=?1 ")
    List<Address> getProfile(@Param("addressId") int addressId);
}

