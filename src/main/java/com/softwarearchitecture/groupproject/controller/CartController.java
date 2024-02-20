package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.CartDto;
import com.softwarearchitecture.groupproject.entity.Cart;
import com.softwarearchitecture.groupproject.repository.CartRepository;
import com.softwarearchitecture.groupproject.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class CartController {

    // Dependency Injection

    CartService cartService;


    /*@GetMapping("/cart")
    public Cart getCart(@RequestParam int id) { return cartRepository.findById(id); }*/

    @PostMapping("/cart")
    public void addCart(@RequestBody CartDto cartDto) { cartService.addToCart(cartDto); }
}
