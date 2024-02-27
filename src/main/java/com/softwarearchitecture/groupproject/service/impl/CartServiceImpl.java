package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.CartDto;
import com.softwarearchitecture.groupproject.entity.Cart;
import com.softwarearchitecture.groupproject.entityMapper.CartEntityMapper;
import com.softwarearchitecture.groupproject.exception.ResourceNotFoundException;
import com.softwarearchitecture.groupproject.repository.CartRepository;
import com.softwarearchitecture.groupproject.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartRepository cartRepository;

    @Autowired
    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public CartDto getCartById(int cartId) {
        Cart cart = cartRepository.findById(cartId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Cart doesn't exist with the given id: " + cartId));
        return CartEntityMapper.mapToCartDto(cart);
    }

    @Override
    public CartDto createCart(CartDto cartDto) {
        Cart cart = CartEntityMapper.mapToCart(cartDto);
        Cart savedCart = cartRepository.save(cart);
        return CartEntityMapper.mapToCartDto(savedCart);
    }

    @Override
    public CartDto updateCart(int cartId, CartDto updatedCartDto) {
        Cart cart = cartRepository.findById(cartId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Cart doesn't exist with the given id: " + cartId));

        cart.setCartId(updatedCartDto.getCartId());
        cart.setUserId(updatedCartDto.getUserId());
        cart.setProductId(updatedCartDto.getProductId());
        cart.setQuantity(updatedCartDto.getQuantity());
        cart.setTotalProductPrice(updatedCartDto.getTotalProductPrice());

        Cart updatedCart = cartRepository.save(cart);
        return CartEntityMapper.mapToCartDto(updatedCart);
    }

    @Override
    public void deleteCart(int cartId) {
        Cart cart = cartRepository.findById(cartId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Cart doesn't exist with the given id: " + cartId));

        cartRepository.deleteById(cartId);
    }

}
