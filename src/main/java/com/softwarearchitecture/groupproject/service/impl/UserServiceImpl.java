package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.UserDto;
import com.softwarearchitecture.groupproject.entity.User;
import com.softwarearchitecture.groupproject.entityMapper.UserEntityMapper;
import com.softwarearchitecture.groupproject.exception.ResourceNotFoundException;
import com.softwarearchitecture.groupproject.repository.UserRepository;
import com.softwarearchitecture.groupproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserEntityMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return UserEntityMapper.mapToUserDto(savedUser);
    }

    @Override
    public UserDto findUser(int userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User doesn't exist with the given id: " + userId));
        return UserEntityMapper.mapToUserDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map((user) ->
                        UserEntityMapper.mapToUserDto(user))
                .collect(Collectors.toList());
    }

    @Override
    public UserDto updateUser(int userId, UserDto updatedUserDto) {
        User user = userRepository.findById(userId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User doesn't exist with the given id: " + userId));

        user.setUserId(updatedUserDto.getUserId());
        user.setFirstName(updatedUserDto.getFirstName());
        user.setLastName(updatedUserDto.getLastName());
        user.setEmail(updatedUserDto.getEmail());
        user.setPhone(updatedUserDto.getPhone());
        user.setPassword(updatedUserDto.getPassword());

        User updatedUser = userRepository.save(user);
        return UserEntityMapper.mapToUserDto(updatedUser);
    }
}
