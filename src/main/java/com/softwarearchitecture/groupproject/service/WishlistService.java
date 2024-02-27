package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.WishlistDto;
import com.softwarearchitecture.groupproject.entity.Wishlist;

import java.util.List;

public interface WishlistService {
    WishlistDto createWishlist(WishlistDto wishlistDto);
    WishlistDto findWishlist(int wishlistId);
    // List<Wishlist> findAllWishlist(int id);

}
