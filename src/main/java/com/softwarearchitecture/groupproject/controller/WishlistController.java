package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.entity.Wishlist;
import com.softwarearchitecture.groupproject.repository.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WishlistController {

    @Autowired
    WishlistRepository wishlistRepository;

    @Autowired
    public WishlistController(WishlistRepository wishlistRepository) { this.wishlistRepository = wishlistRepository; }

    @GetMapping("/wishlist")
    public Wishlist getWishlist(@RequestParam int id) { return wishlistRepository.findById(id); }

    @PostMapping("/wishlist")
    public void addWishlist(@RequestBody Wishlist wishlist) { wishlistRepository.save(wishlist); }

}
