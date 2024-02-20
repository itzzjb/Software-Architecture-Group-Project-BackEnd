package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.AddToWishlistDto;
import com.softwarearchitecture.groupproject.entity.Wishlist;
import com.softwarearchitecture.groupproject.repository.WishlistRepository;
import com.softwarearchitecture.groupproject.service.AddToWishlistService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class AddToWishlistController {

    // Dependency Injection
    @Autowired
    AddToWishlistService addToWishlistService;

    /*@GetMapping("/wishlist")
    public Wishlist getWishlist(@RequestParam int id) { return wishlistRepository.findById(id); }*/

    @PostMapping("/wishlist")
    public void addWishlist(@RequestBody AddToWishlistDto addToWishlistDto) { addToWishlistService.addToWishlist(addToWishlistDto); }

}
