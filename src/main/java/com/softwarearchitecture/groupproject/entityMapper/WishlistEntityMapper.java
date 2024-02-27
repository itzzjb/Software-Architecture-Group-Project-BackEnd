package com.softwarearchitecture.groupproject.entityMapper;

import com.softwarearchitecture.groupproject.dto.WishlistDto;
import com.softwarearchitecture.groupproject.entity.Wishlist;

public class WishlistEntityMapper {
    public static Wishlist mapToWishlist(WishlistDto wishlistDto){
        return new Wishlist(
                wishlistDto.getWishlistId(),
                wishlistDto.getUserId(),
                wishlistDto.getProductId()

        );
    }

    public static WishlistDto mapToWishlistDto(Wishlist wishlist) {
        return new WishlistDto(
                wishlist.getWishlistId(),
                wishlist.getUserId(),
                wishlist.getProductId()
        );
    }

}
