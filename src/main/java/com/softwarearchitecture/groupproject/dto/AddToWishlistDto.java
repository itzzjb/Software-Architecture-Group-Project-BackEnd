package com.softwarearchitecture.groupproject.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddToWishlistDto {
    public int wishlistId;
    public int userId;
    public int productId;
}
