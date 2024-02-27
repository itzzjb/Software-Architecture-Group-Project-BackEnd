package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.OrderDto;
import com.softwarearchitecture.groupproject.entity.Order;
import com.softwarearchitecture.groupproject.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public Order getOrder(@RequestParam int id) {
        return orderService.findOrder(id);
    }


    @PostMapping
    public void addOrder(@RequestBody OrderDto orderDto) {
        orderService.placeOrder(orderDto); }

}
