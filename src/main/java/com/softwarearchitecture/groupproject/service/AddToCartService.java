package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.AddToCartDto;
import com.softwarearchitecture.groupproject.entity.Cart;

public interface AddToCartService {

    Cart findCart(int id);

    void addToCart(AddToCartDto addToCartDto);
}
