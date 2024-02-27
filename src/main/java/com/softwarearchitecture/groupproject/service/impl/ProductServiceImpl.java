package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.ProductDto;
import com.softwarearchitecture.groupproject.entity.Product;
import com.softwarearchitecture.groupproject.entityMapper.ProductEntityMapper;
import com.softwarearchitecture.groupproject.repository.ProductRepository;
import com.softwarearchitecture.groupproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        Product product = ProductEntityMapper.mapToProduct(productDto);
        Product savedProduct = productRepository.save(product);
        return ProductEntityMapper.mapToProductDto(savedProduct);
    }

    @Override
    public Product findProduct(int id) {
        Product product = productRepository.findById(id);
        return product;
    }

}
