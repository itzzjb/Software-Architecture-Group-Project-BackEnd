package com.softwarearchitecture.groupproject.entityMapper;

import com.softwarearchitecture.groupproject.dto.WishlistDto;
import com.softwarearchitecture.groupproject.entity.Wishlist;

public class WishlistEntityMapper {
    public static Wishlist dtoToEntity(WishlistDto addTowishlistDto){

        return new Wishlist(
                addTowishlistDto.getWishlistId(),
                addTowishlistDto.getUserId(),
                addTowishlistDto.getProductId()

        );
    }

}
