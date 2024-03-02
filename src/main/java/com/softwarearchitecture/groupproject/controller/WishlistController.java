package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.CartDto;
import com.softwarearchitecture.groupproject.dto.WishlistDto;
import com.softwarearchitecture.groupproject.entity.Wishlist;
import com.softwarearchitecture.groupproject.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/wishlist")
public class WishlistController {

    @Autowired
    WishlistService wishlistService;

    @Autowired
    public WishlistController(WishlistService wishlistService) {
        this.wishlistService = wishlistService;
    }

    @GetMapping("{id}")
    public ResponseEntity<WishlistDto> getWishlist(@PathVariable("id") int wishlistId) {
        WishlistDto wishlistDto = wishlistService.findWishlist(wishlistId);
        return ResponseEntity.ok(wishlistDto);
    }

    @PostMapping
    public ResponseEntity<WishlistDto> addWishlist(@RequestBody WishlistDto wishlistDto) {
        WishlistDto savedWishlistDto = wishlistService.createWishlist(wishlistDto);
        return new ResponseEntity<>(savedWishlistDto, HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<WishlistDto> updateWishlist(@PathVariable("id") int wishlistId, @RequestBody WishlistDto updatedWishlistDto) {
        WishlistDto wishlistDto = wishlistService.updateWishlist(wishlistId, updatedWishlistDto);
        return ResponseEntity.ok(wishlistDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteWishlist(@PathVariable("id") int wishlistId) {
        wishlistService.deleteWishlist(wishlistId);
        return ResponseEntity.ok("Wishlist item deleted successfully.");
    }

}
