package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.WishlistDto;
import com.softwarearchitecture.groupproject.entity.Wishlist;

public interface WishlistService {

    void addToWishlist(WishlistDto wishlistDto);

    Wishlist findWishlist(int id);

}
