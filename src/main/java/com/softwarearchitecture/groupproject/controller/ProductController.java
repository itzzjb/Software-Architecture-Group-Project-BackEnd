package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.ProductDto;
import com.softwarearchitecture.groupproject.entity.Product;
import com.softwarearchitecture.groupproject.service.AddingAProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    AddingAProductService addingAProductService;

    @Autowired
    public ProductController(AddingAProductService addingAProductService) {
        this.addingAProductService = addingAProductService;
    }

    @GetMapping("/product")
    public Product getProduct(@RequestParam int id) {
        return addingAProductService.findProduct(id);
    }


    @PostMapping("/product")
    public void addProduct(@RequestBody ProductDto productDto) { addingAProductService.addProduct(productDto); }

}
