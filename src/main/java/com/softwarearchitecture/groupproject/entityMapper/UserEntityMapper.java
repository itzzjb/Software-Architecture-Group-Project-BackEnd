package com.softwarearchitecture.groupproject.entityMapper;

import com.softwarearchitecture.groupproject.dto.UserRegistrationDto;
import com.softwarearchitecture.groupproject.entity.User;

public class UserEntityMapper {
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

    public static UserRegistrationDto mapTOUserRegistrationDto(User user) {
        return new UserRegistrationDto(
                user.getUserId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPhone(),
                user.getPassword(),
                user.getPassword()
        );
    }

}
