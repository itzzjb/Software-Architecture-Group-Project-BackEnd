package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.AddToCartDto;
import com.softwarearchitecture.groupproject.service.AddToCartService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class AddToCartController {

    // Dependency Injection

    AddToCartService addToCartService;


    /*@GetMapping("/cart")
    public Cart getCart(@RequestParam int id) { return cartRepository.findById(id); }*/

    @PostMapping("/cart")
    public void addCart(@RequestBody AddToCartDto addToCartDto) { addToCartService.addToCart(addToCartDto); }
}
