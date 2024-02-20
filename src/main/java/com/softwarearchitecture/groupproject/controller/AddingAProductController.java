package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.AddingAProductDto;
import com.softwarearchitecture.groupproject.entity.Product;
import com.softwarearchitecture.groupproject.service.AddingAProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddingAProductController {

    // Dependency Injection
    @Autowired
    AddingAProductService addingAProductService;

    @Autowired
    public AddingAProductController(AddingAProductService addingAProductService) {
        this.addingAProductService = addingAProductService;
    }


    @GetMapping("/product")
    public Product getProduct(@RequestParam int id) {
        return addingAProductService.findProduct(id);
    }


    @PostMapping("/product")
    public void addProduct(@RequestBody AddingAProductDto addingAProductDto) { addingAProductService.addProduct(addingAProductDto); }

}
