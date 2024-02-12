package com.softwarearchitecture.groupproject.entity;
import jakarta.persistence.*;
import lombok.*;

// POJO class for Wishlist
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "wishlist")
public class Wishlist {

    @Id
    public int wishlistId;
    @Column
    public int userId;

    @Column
    public int productId;

}
