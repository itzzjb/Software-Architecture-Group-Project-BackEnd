package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.CartDto;
import com.softwarearchitecture.groupproject.entity.Cart;
import com.softwarearchitecture.groupproject.service.AddToCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    @Autowired
    AddToCartService addToCartService;

    @Autowired
    public CartController(AddToCartService addToCartService) {
        this.addToCartService = addToCartService;
    }

    @GetMapping("/cart")
    public Cart getCart(@RequestParam int id) { return addToCartService.findCart(id);}

    @PostMapping("/cart")
    public void addCart(@RequestBody CartDto cartDto) { addToCartService.addToCart(cartDto); }

}
