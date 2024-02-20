package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.AddToCartDto;
import com.softwarearchitecture.groupproject.dto.AddToWishlistDto;

public interface AddToWishlistService {

    void addToWishlist(AddToWishlistDto addToWishlistDto);
}
