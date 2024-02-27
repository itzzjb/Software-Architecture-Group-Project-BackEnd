package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.CartDto;
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

    @GetMapping("{id}")
    public ResponseEntity<CartDto> getCart(@PathVariable("id") int id) {
        CartDto cartDto = cartService.getCartById(id);
        return ResponseEntity.ok(cartDto);
    }

    @PostMapping
    public ResponseEntity<CartDto> addCart(@RequestBody CartDto cartDto) {
        CartDto savedCartDto = cartService.createCart(cartDto);
        return new ResponseEntity<>(savedCartDto, HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<CartDto> updateCart(@PathVariable("id") int cartId, @RequestBody CartDto updatedCartDto) {
        CartDto cartDto = cartService.updateCart(cartId, updatedCartDto);
        return ResponseEntity.ok(cartDto);
    }

}
