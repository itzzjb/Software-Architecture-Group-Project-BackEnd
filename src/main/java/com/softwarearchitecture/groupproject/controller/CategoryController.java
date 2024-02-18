package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.entity.Category;
import com.softwarearchitecture.groupproject.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryController {

    // Dependency Injection
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/category")
    public Category getCategory(@RequestParam int id) { return categoryRepository.findById(id); }

    @PostMapping("/category")
    public void addCategory(@RequestBody Category category) { categoryRepository.save(category); }

}
