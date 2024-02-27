package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.CategoryDto;
import com.softwarearchitecture.groupproject.entity.Category;

public interface CategoryService {
    void createCategory(CategoryDto categoryDto);

    Category findCategory(int id);

}
