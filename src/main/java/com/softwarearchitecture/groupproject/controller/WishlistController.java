package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.WishlistDto;
import com.softwarearchitecture.groupproject.entity.Wishlist;
import com.softwarearchitecture.groupproject.service.AddToWishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WishlistController {

    @Autowired
    AddToWishlistService addToWishlistService;

    @Autowired
    public WishlistController(AddToWishlistService addToWishlistService) {
        this.addToWishlistService = addToWishlistService;
    }

    @GetMapping("/wishlist")
    public Wishlist getWishlist(@RequestParam int id) { return addToWishlistService.findWishlist(id); }

    @PostMapping("/wishlist")
    public void addWishlist(@RequestBody WishlistDto wishlistDto) { addToWishlistService.addToWishlist(wishlistDto); }

}
