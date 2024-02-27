package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.CartDto;
import com.softwarearchitecture.groupproject.entity.Cart;
import com.softwarearchitecture.groupproject.entityMapper.CartEntityMapper;
import com.softwarearchitecture.groupproject.repository.CartRepository;
import com.softwarearchitecture.groupproject.service.AddToCartService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class AddToCartServiceImpl implements AddToCartService {
    CartRepository cartRepository;

    @Override
    public Cart findCart(int id) {
        Cart cart = cartRepository.findById(id);
        return cart;
    }

    @Override
    public void addToCart(CartDto cartDto) {
        Cart cart = CartEntityMapper.mapToCartDto(cartDto);
        cartRepository.save(cart);
    }
}
