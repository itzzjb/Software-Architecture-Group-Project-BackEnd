package com.softwarearchitecture.groupproject.repository;
import com.softwarearchitecture.groupproject.entity.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishlistRepository extends JpaRepository<Wishlist,Integer> {
    Wishlist findById(int id);

}
