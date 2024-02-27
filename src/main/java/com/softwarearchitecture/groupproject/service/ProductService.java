package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.ProductDto;
import com.softwarearchitecture.groupproject.entity.Product;

public interface ProductService {
    void addProduct (ProductDto productDto);

    Product findProduct(int id);
}

