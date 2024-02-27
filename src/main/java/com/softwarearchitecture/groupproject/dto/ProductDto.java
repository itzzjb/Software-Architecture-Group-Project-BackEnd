package com.softwarearchitecture.groupproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductDto {
    private int productId;

    private String productName;

    private int quantity;

    private int price;

    private int categoryId;

}
