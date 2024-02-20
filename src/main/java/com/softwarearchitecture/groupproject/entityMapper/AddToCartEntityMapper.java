package com.softwarearchitecture.groupproject.entityMapper;

import com.softwarearchitecture.groupproject.dto.AddToCartDto;
import com.softwarearchitecture.groupproject.entity.Cart;

public class AddToCartEntityMapper {

    public static Cart dtoToEntity(AddToCartDto addToCartDto){
        return new Cart(
                addToCartDto.getCartId(),
                addToCartDto.getUserId(),
                addToCartDto.getProductId(),
                addToCartDto.getQuantity(),
                addToCartDto.getTotalProductPrice()
        );
    }
}
