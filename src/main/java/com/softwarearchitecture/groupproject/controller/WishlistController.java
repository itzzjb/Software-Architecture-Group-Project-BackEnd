package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.WishlistDto;
import com.softwarearchitecture.groupproject.entity.Wishlist;
import com.softwarearchitecture.groupproject.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/wishlist")
public class WishlistController {

    @Autowired
    WishlistService wishlistService;

    @Autowired
    public WishlistController(WishlistService wishlistService) {
        this.wishlistService = wishlistService;
    }

    @GetMapping
    public Wishlist getWishlist(@RequestParam int id) { return wishlistService.findWishlist(id); }

    @PostMapping
    public ResponseEntity<WishlistDto> addWishlist(@RequestBody WishlistDto wishlistDto) {
        WishlistDto savedWishlistDto = wishlistService.createWishlist(wishlistDto);
        return new ResponseEntity<>(savedWishlistDto, HttpStatus.CREATED);
    }

}
