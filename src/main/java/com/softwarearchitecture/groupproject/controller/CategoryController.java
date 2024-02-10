package com.softwarearchitecture.groupproject.controller;

import com.softwarearchitecture.groupproject.entity.Category;
import com.softwarearchitecture.groupproject.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryController {
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/category")
    public Category getProduct(@RequestParam int id) {
        return categoryRepository.findById(id);
    }

    @PostMapping("/category")
    public void addProduct(@RequestBody Category category) {categoryRepository.save(category);}

}
