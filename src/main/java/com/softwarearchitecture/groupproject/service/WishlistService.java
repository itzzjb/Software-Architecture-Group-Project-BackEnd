package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.WishlistDto;
import com.softwarearchitecture.groupproject.entity.Wishlist;

public interface WishlistService {

    WishlistDto createWishlist(WishlistDto wishlistDto);

    WishlistDto findWishlist(int id);

}
