package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.AddingAProductDto;
import com.softwarearchitecture.groupproject.entity.Product;
import com.softwarearchitecture.groupproject.entityMapper.AddingAProductEntityMapper;
import com.softwarearchitecture.groupproject.repository.ProductRepository;
import com.softwarearchitecture.groupproject.service.AddingAProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddingAProductServiceImpl implements AddingAProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    public AddingAProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void addProduct(AddingAProductDto addingAProductDto) {
        Product product = AddingAProductEntityMapper.dtoToEntity(addingAProductDto);
        productRepository.save(product);
    }
}
