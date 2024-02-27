package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.ProductDto;
import com.softwarearchitecture.groupproject.entity.Product;
import com.softwarearchitecture.groupproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public Product getProduct(@RequestParam int id) {
        return productService.findProduct(id);
    }


    @PostMapping("/product")
    public void addProduct(@RequestBody ProductDto productDto) { productService.addProduct(productDto); }

}
