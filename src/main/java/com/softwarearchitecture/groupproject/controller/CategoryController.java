package com.softwarearchitecture.groupproject.controller;

import com.softwarearchitecture.groupproject.entity.Category;
import com.softwarearchitecture.groupproject.entity.Product;
import com.softwarearchitecture.groupproject.repository.CategoryRepository;
import com.softwarearchitecture.groupproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

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
