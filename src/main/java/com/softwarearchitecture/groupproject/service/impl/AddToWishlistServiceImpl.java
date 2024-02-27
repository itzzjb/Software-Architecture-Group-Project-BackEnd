package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.WishlistDto;
import com.softwarearchitecture.groupproject.entity.Wishlist;
import com.softwarearchitecture.groupproject.entityMapper.WishlistEntityMapper;
import com.softwarearchitecture.groupproject.repository.WishlistRepository;
import com.softwarearchitecture.groupproject.service.AddToWishlistService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddToWishlistServiceImpl implements AddToWishlistService {

    WishlistRepository wishlistRepository;

    @Override
    public void addToWishlist(WishlistDto wishlistDto) {
        Wishlist wishlist = WishlistEntityMapper.dtoToEntity(wishlistDto);
        wishlistRepository.save(wishlist);
    }

    @Override
    public Wishlist findWishlist(int id) {
        Wishlist wishlist = wishlistRepository.findById(id);
        return wishlist;
    }
}
