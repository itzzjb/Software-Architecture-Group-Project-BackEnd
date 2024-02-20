package com.softwarearchitecture.groupproject.entityMapper;

import com.softwarearchitecture.groupproject.dto.AddToCartDto;
import com.softwarearchitecture.groupproject.dto.AddToWishlistDto;
import com.softwarearchitecture.groupproject.entity.Cart;
import com.softwarearchitecture.groupproject.entity.Wishlist;

public class AddToWishlistEntityMapper {
    public static Wishlist dtoToEntity(AddToWishlistDto addTowishlistDto){

        return new Wishlist(
                addTowishlistDto.getWishlistId(),
                addTowishlistDto.getUserId(),
                addTowishlistDto.getProductId()

        );
    }
}
