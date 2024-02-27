package com.softwarearchitecture.groupproject.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private String confirmPassword;


}
