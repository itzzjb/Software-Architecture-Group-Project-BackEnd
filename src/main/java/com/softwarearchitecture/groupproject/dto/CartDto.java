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

public class CartDto {
    public int cartId;
    public int userId;
    public int productId;
    public int quantity;
    public int totalProductPrice;

}
