package com.softwarearchitecture.groupproject.entityMapper;

import com.softwarearchitecture.groupproject.dto.ProductDto;
import com.softwarearchitecture.groupproject.entity.Product;

public class ProductEntityMapper {

    public static Product mapToProduct(ProductDto productDto) {
        return new Product(
                productDto.getProductId(),
                productDto.getProductName(),
                productDto.getQuantity(),
                productDto.getPrice(),
                productDto.getCategoryId()
        );
    }

    public static ProductDto mapToProductDto(Product product) {
        return new ProductDto(
                product.getProductId(),
                product.getProductName(),
                product.getQuantity(),
                product.getPrice(),
                product.getCategoryId()
        );
    }

}
