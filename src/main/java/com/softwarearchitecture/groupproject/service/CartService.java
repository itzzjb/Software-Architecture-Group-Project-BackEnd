package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.CartDto;
import com.softwarearchitecture.groupproject.entity.Cart;

public interface CartService {

    Cart findCart(int id);

    void addToCart(CartDto cartDto);
}
