package com.softwarearchitecture.groupproject.repository;
import com.softwarearchitecture.groupproject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
