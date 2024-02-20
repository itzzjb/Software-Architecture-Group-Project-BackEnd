package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.AddToCartDto;
import com.softwarearchitecture.groupproject.dto.AddToWishlistDto;
import com.softwarearchitecture.groupproject.entity.Wishlist;

public interface AddToWishlistService {

    void addToWishlist(AddToWishlistDto addToWishlistDto);

    Wishlist findWishlist(int id);

}
