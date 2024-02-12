package com.softwarearchitecture.groupproject.entity;
import jakarta.persistence.*;
import lombok.*;

//POJO class for Product
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
