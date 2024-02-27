package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.WishlistDto;
import com.softwarearchitecture.groupproject.entity.Wishlist;
import com.softwarearchitecture.groupproject.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WishlistController {

    @Autowired
    WishlistService wishlistService;

    @Autowired
    public WishlistController(WishlistService wishlistService) {
        this.wishlistService = wishlistService;
    }

    @GetMapping("/wishlist")
    public Wishlist getWishlist(@RequestParam int id) { return wishlistService.findWishlist(id); }

    @PostMapping("/wishlist")
    public void addWishlist(@RequestBody WishlistDto wishlistDto) { wishlistService.addToWishlist(wishlistDto); }

}
