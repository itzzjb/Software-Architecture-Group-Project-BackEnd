package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.CategoryDto;
import com.softwarearchitecture.groupproject.entity.Category;
import com.softwarearchitecture.groupproject.entityMapper.CategoryEntityMapper;
import com.softwarearchitecture.groupproject.repository.CategoryRepository;
import com.softwarearchitecture.groupproject.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public void createCategory(CategoryDto categoryDto) {
        Category category = CategoryEntityMapper.mapToCategoryDto(categoryDto);
        categoryRepository.save(category);
    }

    @Override
    public Category findCategory(int id) {
        Category category =  categoryRepository.findById(id);
        return category;
    }
}
