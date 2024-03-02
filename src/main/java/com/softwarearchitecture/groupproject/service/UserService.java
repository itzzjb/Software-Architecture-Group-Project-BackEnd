package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto findUser(int userId);
    List<UserDto> getAllUsers();
    UserDto updateUser(int userId, UserDto updatedUserDto);
    void deleteUser(int userId);
    UserDetailsService userDetailsService();
}
