package com.softwarearchitecture.groupproject.entityMapper;

import com.softwarearchitecture.groupproject.dto.UserRegistrationDto;
import com.softwarearchitecture.groupproject.entity.User;

import javax.swing.text.html.parser.Entity;

public class UserRegEntityMapper {
     public static User dtoToEntity(UserRegistrationDto userRegistrationDto){
        return new User(
                userRegistrationDto.getUserId(),
                userRegistrationDto.getFirstName(),
                userRegistrationDto.getLastName(),
                userRegistrationDto.getEmail(),
                userRegistrationDto.getPhone(),
                userRegistrationDto.getPassword()
        );
    }


}
