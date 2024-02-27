package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.WishlistDto;
import com.softwarearchitecture.groupproject.entity.Wishlist;

public interface WishlistService {

    void createWishlist(WishlistDto wishlistDto);

    Wishlist findWishlist(int id);

}
