package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.CartDto;
import com.softwarearchitecture.groupproject.entity.Cart;
import com.softwarearchitecture.groupproject.entityMapper.CartEntityMapper;
import com.softwarearchitecture.groupproject.repository.CartRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class CartServiceImplementation implements CartService{
    CartRepository cartRepository;
    @Override
    public void addToCart(CartDto cartDto) {
        Cart cart = CartEntityMapper.dtoToEntity(cartDto);
        cartRepository.save(cart);
    }
}
