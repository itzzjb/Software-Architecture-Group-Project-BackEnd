package com.softwarearchitecture.groupproject.entityMapper;

import com.softwarearchitecture.groupproject.dto.CartDto;
import com.softwarearchitecture.groupproject.entity.Cart;

public class AddToCartEntityMapper {

    public static Cart dtoToEntity(CartDto cartDto){
        return new Cart(
                cartDto.getCartId(),
                cartDto.getUserId(),
                cartDto.getProductId(),
                cartDto.getQuantity(),
                cartDto.getTotalProductPrice()
        );
    }
}
