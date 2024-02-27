package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto findUser(int userId);
    List<UserDto> getAllUsers();
}
