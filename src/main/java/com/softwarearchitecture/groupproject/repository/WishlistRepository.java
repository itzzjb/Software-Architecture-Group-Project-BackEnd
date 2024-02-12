package com.softwarearchitecture.groupproject.repository;

import com.softwarearchitecture.groupproject.entity.Category;
import com.softwarearchitecture.groupproject.entity.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishlistRepository extends JpaRepository<Wishlist,Integer> {
    Category findById(int id);
}