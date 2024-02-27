package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.WishlistDto;
import com.softwarearchitecture.groupproject.entity.Wishlist;
import com.softwarearchitecture.groupproject.entityMapper.WishlistEntityMapper;
import com.softwarearchitecture.groupproject.exception.ResourceNotFoundException;
import com.softwarearchitecture.groupproject.repository.WishlistRepository;
import com.softwarearchitecture.groupproject.service.WishlistService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishlistServiceImpl implements WishlistService {

    @Autowired
    WishlistRepository wishlistRepository;

    @Autowired
    public WishlistServiceImpl(WishlistRepository wishlistRepository) {
        this.wishlistRepository = wishlistRepository;
    }

    @Override
    public WishlistDto createWishlist(WishlistDto wishlistDto) {
        Wishlist wishlist = WishlistEntityMapper.mapToWishlist(wishlistDto);
        Wishlist savedWishlist = wishlistRepository.save(wishlist);
        return WishlistEntityMapper.mapToWishlistDto(savedWishlist);
    }

    @Override
    public WishlistDto findWishlist(int wishlistId) {
        Wishlist wishlist = wishlistRepository.findById(wishlistId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Wishlist doesn't exist with the given id: " + wishlistId));
        return WishlistEntityMapper.mapToWishlistDto(wishlist);
    }
}
