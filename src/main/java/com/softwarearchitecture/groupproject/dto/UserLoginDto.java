package com.softwarearchitecture.groupproject.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserLoginDto {

    private String email;
    private String password;

}
