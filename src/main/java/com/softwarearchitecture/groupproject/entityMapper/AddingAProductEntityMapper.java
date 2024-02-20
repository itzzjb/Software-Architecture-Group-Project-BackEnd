package com.softwarearchitecture.groupproject.entityMapper;

import com.softwarearchitecture.groupproject.dto.AddingAProductDto;
import com.softwarearchitecture.groupproject.entity.Product;

public class AddingAProductEntityMapper {

    public static Product dtoToEntity(AddingAProductDto addingAProductDto) {
        return new Product(
                addingAProductDto.getProductId(),
                addingAProductDto.getProductName(),
                addingAProductDto.getQuantity(),
                addingAProductDto.getPrice(),
                addingAProductDto.getCategoryId()
        );
    }
}
