package com.softwarearchitecture.groupproject.entityMapper;

import com.softwarearchitecture.groupproject.dto.CategoryDto;
import com.softwarearchitecture.groupproject.entity.Category;



public class CategoryEntityMapper {

    public static Category mapToCategory(CategoryDto categoryDto) {
        return new Category(
                categoryDto.getCategoryId(),
                categoryDto.getCategoryName()
        );
    }

    public static CategoryDto mapToCategoryDto(Category category) {
        return new CategoryDto(
                category.getCategoryId(),
                category.getCategoryName()
        );
    }

}
