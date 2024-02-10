package com.softwarearchitecture.groupproject.entity;

import jakarta.persistence.*;

//POJO class for Cart
@Entity
@Table(name = "cart")
public class Cart {

    @Column
    public int userId;

    @Column
    public int productId;

    @Column
    public int quantity;

    @Column
    public int totalProductPrice;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalProductPrice() {
        return totalProductPrice;
    }

    public void setTotalProductPrice(int totalProductPrice) {
        this.totalProductPrice = totalProductPrice;
    }
}
