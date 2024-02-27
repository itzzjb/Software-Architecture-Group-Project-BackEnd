package com.softwarearchitecture.groupproject.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class WishlistDto {
    public int wishlistId;
    public int userId;
    public int productId;
}
