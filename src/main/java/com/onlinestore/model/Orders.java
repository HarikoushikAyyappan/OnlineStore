package com.onlinestore.model;
import javax.persistence.*;
@Entity
@Table(name="orders")
public class Orders {
    @Id
    @Column(name="orderId")
    private int orderId;
    @Column(name="customerId")
    private int customerId;
    @Column(name="productId")
    private int productId;
    @Column(name="name")
    private String name;
    @Column(name="cost")
    private int cost;
    @Column(name="status")
    private String status;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
