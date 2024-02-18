package com.softwarearchitecture.groupproject.entity;
import jakarta.persistence.*;
import lombok.*;

// POJO class for Wishlist
// Used lombok annotations for creating getters, setters and constructors
@Data
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
