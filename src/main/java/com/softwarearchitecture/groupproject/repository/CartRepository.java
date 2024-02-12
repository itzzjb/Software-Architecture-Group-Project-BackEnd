package com.softwarearchitecture.groupproject.repository;

import com.softwarearchitecture.groupproject.entity.Cart;
import com.softwarearchitecture.groupproject.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Integer> {
    Cart findById(int id);
}
