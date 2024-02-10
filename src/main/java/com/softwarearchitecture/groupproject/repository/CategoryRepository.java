package com.softwarearchitecture.groupproject.repository;

import com.softwarearchitecture.groupproject.entity.Category;
import com.softwarearchitecture.groupproject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
    Category findById(int id);
}
