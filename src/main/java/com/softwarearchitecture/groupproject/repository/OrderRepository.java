package com.softwarearchitecture.groupproject.repository;
import com.softwarearchitecture.groupproject.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    Order findById(int Id);

}