package com.softwarearchitecture.groupproject.entity;
import jakarta.persistence.*;

// This is a POJO class for order
@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue
    private int orderId;

    @Column
    private int userId;

    @Column
    private int totalQuantity;

    @Column
    private int totalPrice;

    @Column
    private String dateTime;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
