package com.softwarearchitecture.groupproject.entityMapper;

import com.softwarearchitecture.groupproject.dto.CartDto;
import com.softwarearchitecture.groupproject.entity.Cart;

public class CartEntityMapper {

    public static Cart mapToCart(CartDto cartDto){
        return new Cart(
                cartDto.getCartId(),
                cartDto.getUserId(),
                cartDto.getProductId(),
                cartDto.getQuantity(),
                cartDto.getTotalProductPrice()
        );
    }

    public static CartDto mapToCartDto(Cart cart){
        return new CartDto(
                cart.getCartId(),
                cart.getUserId(),
                cart.getProductId(),
                cart.getQuantity(),
                cart.getTotalProductPrice()
        );
    }

}
