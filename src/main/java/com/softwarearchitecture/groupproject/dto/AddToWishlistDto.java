package com.softwarearchitecture.groupproject.dto;

import jakarta.persistence.Column;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AddToWishlistDto {
    public int wishlistId;
    public int userId;
    public int productId;
}
