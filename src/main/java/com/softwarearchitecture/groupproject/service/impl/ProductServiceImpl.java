package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.ProductDto;
import com.softwarearchitecture.groupproject.entity.Order;
import com.softwarearchitecture.groupproject.entity.Product;
import com.softwarearchitecture.groupproject.entityMapper.OrderEntityMapper;
import com.softwarearchitecture.groupproject.entityMapper.ProductEntityMapper;
import com.softwarearchitecture.groupproject.exception.ResourceNotFoundException;
import com.softwarearchitecture.groupproject.repository.ProductRepository;
import com.softwarearchitecture.groupproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public ProductDto getProductById(int id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Product doesn't exist with the given id: " + id));
        return ProductEntityMapper.mapToProductDto(product);
    }

    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map((product) ->
                        ProductEntityMapper.mapToProductDto(product))
                .collect(Collectors.toList());
    }

}
