package com.softwarearchitecture.groupproject.entity;
import jakarta.persistence.*;
import lombok.*;

// POJO class for Category
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "categories")
public class Category {
    @Id
    private int categoryId;

    @Column
    private String categoryName;

}
