package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.ProductDto;
import com.softwarearchitecture.groupproject.entity.Product;
import com.softwarearchitecture.groupproject.entityMapper.ProductEntityMapper;
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
    public void addProduct(ProductDto productDto) {
        Product product = ProductEntityMapper.dtoToEntity(productDto);
        productRepository.save(product);
    }

    @Override
    public Product findProduct(int id) {
        Product product = productRepository.findById(id);
        return product;
    }

}
