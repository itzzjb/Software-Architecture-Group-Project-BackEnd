package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.WishlistDto;
import com.softwarearchitecture.groupproject.entity.Wishlist;
import com.softwarearchitecture.groupproject.entityMapper.WishlistEntityMapper;
import com.softwarearchitecture.groupproject.repository.WishlistRepository;
import com.softwarearchitecture.groupproject.service.WishlistService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class WishlistServiceImpl implements WishlistService {

    WishlistRepository wishlistRepository;

    @Override
    public WishlistDto createWishlist(WishlistDto wishlistDto) {
        Wishlist wishlist = WishlistEntityMapper.mapToWishlist(wishlistDto);
        Wishlist savedWishlist = wishlistRepository.save(wishlist);
        return WishlistEntityMapper.mapToWishlistDto(savedWishlist);
    }

    @Override
    public Wishlist findWishlist(int id) {
        Wishlist wishlist = wishlistRepository.findById(id);
        return wishlist;
    }
}
