package com.softwarearchitecture.groupproject.entity;
import jakarta.persistence.*;
import lombok.*;

// POJO class for Product
// Used lombok annotations for creating getters, setters and constructors
@Data
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
