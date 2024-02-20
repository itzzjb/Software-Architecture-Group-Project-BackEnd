package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.entity.Product;
import com.softwarearchitecture.groupproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddingAProductController {

    // Dependency Injection
    @Autowired
    ProductRepository productRepository;

    @Autowired
    public AddingAProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/product")
    public Product getProduct(@RequestParam int id) {
        return productRepository.findById(id);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product product) { productRepository.save(product); }

}
