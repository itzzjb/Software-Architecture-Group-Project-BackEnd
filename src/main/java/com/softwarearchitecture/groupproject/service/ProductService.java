package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.ProductDto;
import com.softwarearchitecture.groupproject.entity.Product;

public interface ProductService {
    ProductDto createProduct(ProductDto productDto);

    Product findProduct(int id);
}

