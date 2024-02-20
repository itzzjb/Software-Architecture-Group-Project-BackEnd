package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.PlacingOrderDto;
import com.softwarearchitecture.groupproject.entity.Order;
import com.softwarearchitecture.groupproject.repository.OrderRepository;
import com.softwarearchitecture.groupproject.service.PlacingOrderService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlacingOrderController {

    // Dependency Injection
    @Autowired
    PlacingOrderService placingOrderService;

    @Autowired
    public PlacingOrderController(PlacingOrderService placingOrderService) {
        this.placingOrderService = placingOrderService;
    }

    /*
    @GetMapping("/order")
    public Order getOrder(@RequestParam int id) {
        return orderRepository.findById(id);
    }
    */

    @PostMapping("/order")
    public void addOrder(@RequestBody PlacingOrderDto placingOrderDto) {
        placingOrderService.placeOrder(placingOrderDto); }

}
