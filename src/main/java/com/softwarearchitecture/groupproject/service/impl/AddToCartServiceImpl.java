package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.AddToCartDto;
import com.softwarearchitecture.groupproject.entity.Cart;
import com.softwarearchitecture.groupproject.entityMapper.AddToCartEntityMapper;
import com.softwarearchitecture.groupproject.repository.CartRepository;
import com.softwarearchitecture.groupproject.service.AddToCartService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class AddToCartServiceImpl implements AddToCartService {
    CartRepository cartRepository;
    @Override
    public void addToCart(AddToCartDto addToCartDto) {
        Cart cart = AddToCartEntityMapper.dtoToEntity(addToCartDto);
        cartRepository.save(cart);
    }
}
