package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.CategoryDto;
import com.softwarearchitecture.groupproject.entity.Category;

import java.util.List;

public interface CategoryService {
    CategoryDto createCategory(CategoryDto categoryDto);
    CategoryDto getCategoryById(int categoryId);
    List<CategoryDto> getAllCategories();

}
