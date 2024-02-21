package com.softwarearchitecture.groupproject.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

// POJO class for Wishlist
// Used lombok annotations for creating getters, setters and constructors
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "wishlist")
public class Wishlist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "wish_id")
    public int wishlistId;

    //onetoone - one wishlist has one user
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user_id")
    public User user;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_wish_id", nullable = false,referencedColumnName = "wish_id")
    public List<Product> product;

    public Wishlist(int wishlistId, int userId, int productId) {
    }
}
