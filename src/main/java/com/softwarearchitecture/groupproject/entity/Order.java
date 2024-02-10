package com.softwarearchitecture.groupproject.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// This is a POJO class for order

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
