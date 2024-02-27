package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.CartDto;
import com.softwarearchitecture.groupproject.entity.Cart;

import java.util.List;

public interface CartService {
    CartDto getCartById(int cartId);
    CartDto createCart(CartDto cartDto);
    // List<CartDto> getAllCart(int id);

}
