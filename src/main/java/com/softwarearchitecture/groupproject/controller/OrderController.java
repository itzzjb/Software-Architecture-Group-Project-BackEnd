package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.OrderDto;
import com.softwarearchitecture.groupproject.entity.Order;
import com.softwarearchitecture.groupproject.service.PlacingOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @Autowired
    PlacingOrderService placingOrderService;

    @Autowired
    public OrderController(PlacingOrderService placingOrderService) {
        this.placingOrderService = placingOrderService;
    }

    @GetMapping("/order")
    public Order getOrder(@RequestParam int id) {
        return placingOrderService.findOrder(id);
    }


    @PostMapping("/order")
    public void addOrder(@RequestBody OrderDto orderDto) {
        placingOrderService.placeOrder(orderDto); }

}
