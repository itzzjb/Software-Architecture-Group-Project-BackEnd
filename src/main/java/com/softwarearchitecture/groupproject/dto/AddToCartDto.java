package com.softwarearchitecture.groupproject.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AddToCartDto {
    public int cartId;
    public int userId;
    public int productId;
    public int quantity;
    public int totalProductPrice;

}
