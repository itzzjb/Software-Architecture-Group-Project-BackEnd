package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.entity.Order;
import com.softwarearchitecture.groupproject.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlacingOrderController {

    // Dependency Injection
    @Autowired
    OrderRepository orderRepository;

    @Autowired
    public PlacingOrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/order")
    public Order getOrder(@RequestParam int id) {
        return orderRepository.findById(id);
    }

    @PostMapping("/order")
    public void addOrder(@RequestBody Order order) { orderRepository.save(order); }

}
