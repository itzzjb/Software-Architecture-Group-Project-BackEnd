package com.softwarearchitecture.groupproject.entity;
import jakarta.persistence.*;
import lombok.*;

// POJO class for Order
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
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

}
