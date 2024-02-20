package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.CategoryDto;
import com.softwarearchitecture.groupproject.entity.Category;
import com.softwarearchitecture.groupproject.repository.CategoryRepository;
import com.softwarearchitecture.groupproject.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryController {

    // Dependency Injection
    @Autowired
    CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/category")
    public Category getCategory(@RequestParam int id) { return categoryService.findCategory(id); }

    @PostMapping("/category")
    public void addCategory(@RequestBody CategoryDto categoryDto) { categoryService.addCategory(categoryDto); }

}
