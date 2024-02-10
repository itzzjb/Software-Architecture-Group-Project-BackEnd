package com.softwarearchitecture.groupproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Entity
@Table(name = "Category")
public class Category {
    @Id
    @GeneratedValue
    private int categoryId;

    @Column(nullable = false)
    private String categoryName;
}
