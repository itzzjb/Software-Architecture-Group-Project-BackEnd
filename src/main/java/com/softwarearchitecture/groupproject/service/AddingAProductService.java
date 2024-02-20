package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.AddingAProductDto;
import com.softwarearchitecture.groupproject.entity.Product;

public interface AddingAProductService {
    void addProduct (AddingAProductDto addingAProductDto);

    Product findProduct(int id);
}

