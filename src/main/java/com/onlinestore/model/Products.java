package com.onlinestore.model;
import javax.persistence.*;
@Entity
@Table(name="products")
public class Products {
    @Id
    @Column(name="productId")
    private int productId;
    @Column(name="name")
    private String name;
    @Column(name="count")
    private int count;
    @Column(name="cost")
    private int cost;

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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
