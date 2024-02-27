package com.softwarearchitecture.groupproject.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CartDto {
    public int cartId;
    public int userId;
    public int productId;
    public int quantity;
    public int totalProductPrice;

}
