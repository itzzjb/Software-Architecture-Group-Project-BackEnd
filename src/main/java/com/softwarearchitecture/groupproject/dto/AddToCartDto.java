package com.softwarearchitecture.groupproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class AddToCartDto {
    public int cartId;
    public int userId;
    public int productId;
    public int quantity;
    public int totalProductPrice;

}
