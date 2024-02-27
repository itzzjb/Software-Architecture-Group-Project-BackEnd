package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.CategoryDto;
import com.softwarearchitecture.groupproject.entity.Cart;
import com.softwarearchitecture.groupproject.entity.Category;
import com.softwarearchitecture.groupproject.entityMapper.CartEntityMapper;
import com.softwarearchitecture.groupproject.entityMapper.CategoryEntityMapper;
import com.softwarearchitecture.groupproject.exception.ResourceNotFoundException;
import com.softwarearchitecture.groupproject.repository.CategoryRepository;
import com.softwarearchitecture.groupproject.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        Category category = CategoryEntityMapper.mapToCategory(categoryDto);
        Category savedCategory = categoryRepository.save(category);
        return CategoryEntityMapper.mapToCategoryDto(savedCategory);
    }

    @Override
    public CategoryDto getCategoryById(int categoryId) {
        Category category =  categoryRepository.findById(categoryId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Category doesn't exist with the given id: " + categoryId));
        return CategoryEntityMapper.mapToCategoryDto(category);
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream().map((category) ->
                CategoryEntityMapper.mapToCategoryDto(category))
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDto updateCategory(int categoryId, CategoryDto updatedCategoryDto) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Category doesn't exist with the given id: " + categoryId));

        category.setCategoryId(updatedCategoryDto.getCategoryId());
        category.setCategoryName(updatedCategoryDto.getCategoryName());

        Category updatedCategory = categoryRepository.save(category);
        return CategoryEntityMapper.mapToCategoryDto(updatedCategory);
    }

    @Override
    public void deleteCategory(int categoryId) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Category doesn't exist with the given id: " + categoryId));

        categoryRepository.deleteById(categoryId);
    }

}
