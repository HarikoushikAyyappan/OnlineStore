package com.onlinestore.model;
import javax.persistence.*;
@Entity
@Table(name="customer")
public class Customer {
    @Id
    @Column(name ="customerId")
    private int customerId;
    @Column(name="customername")
    private String customerName;
    @Column(name= "password")
    private String password;
    @Column(name= "addressId")
    private int addressId;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }
}
