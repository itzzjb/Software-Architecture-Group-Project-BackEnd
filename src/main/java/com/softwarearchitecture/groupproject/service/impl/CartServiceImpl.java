package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.CartDto;
import com.softwarearchitecture.groupproject.entity.Cart;
import com.softwarearchitecture.groupproject.entityMapper.CartEntityMapper;
import com.softwarearchitecture.groupproject.repository.CartRepository;
import com.softwarearchitecture.groupproject.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class CartServiceImpl implements CartService {
    CartRepository cartRepository;

    @Override
    public Cart findCart(int id) {
        Cart cart = cartRepository.findById(id);
        return cart;
    }

    @Override
    public CartDto createCart(CartDto cartDto) {
        Cart cart = CartEntityMapper.mapToCart(cartDto);
        Cart savedCart = cartRepository.save(cart);
        return CartEntityMapper.mapToCartDto(savedCart);
    }

}
