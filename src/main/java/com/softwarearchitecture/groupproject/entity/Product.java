package com.softwarearchitecture.groupproject.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue
    private int productId;

    @Column
    private String productName;

    @Column
    private int quantity;

    @Column
    private int price;

    @Column
    private int categoryId;

}
