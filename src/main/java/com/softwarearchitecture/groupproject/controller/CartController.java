package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.CartDto;
import com.softwarearchitecture.groupproject.entity.Cart;
import com.softwarearchitecture.groupproject.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping
    public Cart getCart(@RequestParam int id) { return cartService.getCartById(id);}

    @PostMapping
    public ResponseEntity<CartDto> addCart(@RequestBody CartDto cartDto) {
        CartDto savedCartDto = cartService.createCart(cartDto);
        return new ResponseEntity<>(savedCartDto, HttpStatus.CREATED);
    }

}
