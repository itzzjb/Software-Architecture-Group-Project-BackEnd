package com.softwarearchitecture.groupproject.entity;
import jakarta.persistence.*;
import lombok.*;

// POJO class for Order
// Used lombok annotations for creating getters, setters and constructors
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue
    private int orderId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column
    private int totalQuantity;

    @Column
    private int totalPrice;

    @Column
    private String dateTime;

    public Order(int orderId, int userId, int totalQuantity, int totalPrice, String dateTime) {
    }
}
