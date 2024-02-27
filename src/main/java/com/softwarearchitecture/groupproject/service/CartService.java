package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.CartDto;
import com.softwarearchitecture.groupproject.entity.Cart;

public interface CartService {

    CartDto getCartById(int id);

    CartDto createCart(CartDto cartDto);
}
