package com.softwarearchitecture.groupproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//POJO class for Cart
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
