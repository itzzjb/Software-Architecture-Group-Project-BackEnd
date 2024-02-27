package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.AddToCartDto;
import com.softwarearchitecture.groupproject.entity.Cart;
import com.softwarearchitecture.groupproject.service.AddToCartService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddToCartController {

    // Dependency Injection
    @Autowired
    AddToCartService addToCartService;

    @Autowired
    public AddToCartController(AddToCartService addToCartService) {
        this.addToCartService = addToCartService;
    }

    @GetMapping("/cart")
    public Cart getCart(@RequestParam int id) { return addToCartService.findCart(id);}

    @PostMapping("/cart")
    public void addCart(@RequestBody AddToCartDto addToCartDto) { addToCartService.addToCart(addToCartDto); }

}
