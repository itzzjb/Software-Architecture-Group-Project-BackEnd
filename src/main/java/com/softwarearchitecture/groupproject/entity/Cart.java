package com.softwarearchitecture.groupproject.entity;
import jakarta.persistence.*;
import lombok.*;

// POJO class for Cart
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cart")
public class Cart {

    @Id
    public int cartId;
    @Column
    public int userId;

    @Column
    public int productId;

    @Column
    public int quantity;

    @Column
    public int totalProductPrice;

}
