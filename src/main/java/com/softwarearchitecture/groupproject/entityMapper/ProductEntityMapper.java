package com.softwarearchitecture.groupproject.entityMapper;

import com.softwarearchitecture.groupproject.dto.ProductDto;
import com.softwarearchitecture.groupproject.entity.Product;

public class ProductEntityMapper {

    public static Product dtoToEntity(ProductDto productDto) {
        return new Product(
                productDto.getProductId(),
                productDto.getProductName(),
                productDto.getQuantity(),
                productDto.getPrice(),
                productDto.getCategoryId()
        );
    }

}
