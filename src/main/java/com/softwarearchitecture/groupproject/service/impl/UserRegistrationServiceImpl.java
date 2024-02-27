package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.UserRegistrationDto;
import com.softwarearchitecture.groupproject.entity.User;
import com.softwarearchitecture.groupproject.entityMapper.UserEntityMapper;
import com.softwarearchitecture.groupproject.exception.ResourceNotFoundException;
import com.softwarearchitecture.groupproject.repository.UserRepository;
import com.softwarearchitecture.groupproject.service.UserRegisterService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationServiceImpl implements UserRegisterService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    public UserRegistrationServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserRegistrationDto createUser(UserRegistrationDto userRegistrationDto) {
        User user = UserEntityMapper.mapToUser(userRegistrationDto);
        User savedUser = userRepository.save(user);
        return UserEntityMapper.mapTOUserRegistrationDto(savedUser);
    }

    @Override
    public UserRegistrationDto findUser(int id) {
        User user = userRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User doesn't exist with the given id: " + id));
        return UserEntityMapper.mapTOUserRegistrationDto(user);
    }
}