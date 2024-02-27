package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.CartDto;
import com.softwarearchitecture.groupproject.dto.OrderDto;
import com.softwarearchitecture.groupproject.dto.ProductDto;
import com.softwarearchitecture.groupproject.entity.Product;
import com.softwarearchitecture.groupproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductDto> getProduct(@PathVariable("id") int id) {
        ProductDto productDto = productService.getProductById(id);
        return ResponseEntity.ok(productDto);
    }

    @PostMapping
    public ResponseEntity<ProductDto> addProduct(@RequestBody ProductDto productDto) {
        ProductDto savedProductDto = productService.createProduct(productDto);
        return new ResponseEntity<>(savedProductDto, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> getAllProducts() {
        List<ProductDto> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @PutMapping("{id}")
    public ResponseEntity<ProductDto> updateProduct(@PathVariable("id") int productId, @RequestBody ProductDto updatedProductDto) {
        ProductDto productDto = productService.updateProduct(productId, updatedProductDto);
        return ResponseEntity.ok(productDto);
    }

}
