package com.softwarearchitecture.groupproject.entity;
import jakarta.persistence.*;
import lombok.*;

// POJO class for User
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    private int userId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private String password;

}
