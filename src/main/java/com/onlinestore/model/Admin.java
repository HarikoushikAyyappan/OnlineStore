package com.onlinestore.model;
import javax.persistence.*;
@Entity
@Table(name="admin")
public class Admin {
    @Id
    @Column(name="adminId")
    private int adminId;
    @Column(name="adminname")
    private String adminName;
    @Column(name="password")
    private String password;
    @Column(name="addressId")
    private int addressId;

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
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
