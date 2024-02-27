package com.softwarearchitecture.groupproject.entityMapper;

import com.softwarearchitecture.groupproject.dto.UserDto;
import com.softwarearchitecture.groupproject.entity.User;

public class UserEntityMapper {
     public static User mapToUser(UserDto userDto){
        return new User(
                userDto.getUserId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail(),
                userDto.getPhone(),
                userDto.getPassword()
        );
    }

    public static UserDto mapToUserDto(User user) {
        return new UserDto(
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
