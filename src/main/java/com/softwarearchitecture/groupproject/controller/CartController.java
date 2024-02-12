package com.softwarearchitecture.groupproject.controller;

import com.softwarearchitecture.groupproject.entity.Cart;
import com.softwarearchitecture.groupproject.entity.Category;
import com.softwarearchitecture.groupproject.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {
    @Autowired
    CartRepository cartRepository;

    @Autowired
    public CartController(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @GetMapping("/cart")
    public Category getProduct(@RequestParam int id) {return cartRepository.findById(id);}

    @PostMapping("/cart")
    public void addProduct(@RequestBody Cart cart) {cartRepository.save(cart);}
}
