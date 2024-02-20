package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.AddToWishlistDto;
import com.softwarearchitecture.groupproject.entity.Cart;
import com.softwarearchitecture.groupproject.entity.Wishlist;
import com.softwarearchitecture.groupproject.entityMapper.AddToCartEntityMapper;
import com.softwarearchitecture.groupproject.entityMapper.AddToWishlistEntityMapper;
import com.softwarearchitecture.groupproject.repository.CartRepository;
import com.softwarearchitecture.groupproject.repository.WishlistRepository;
import com.softwarearchitecture.groupproject.service.AddToWishlistService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddToWishlistServiceImpl implements AddToWishlistService {

    WishlistRepository wishlistRepository;

    @Override
    public void addToWishlist(AddToWishlistDto addToWishlistDto) {
        Wishlist wishlist = AddToWishlistEntityMapper.dtoToEntity(addToWishlistDto);
        wishlistRepository.save(wishlist);
    }

    @Override
    public Wishlist findWishlist(int id) {
        Wishlist wishlist = wishlistRepository.findById(id);
        return wishlist;
    }
}
