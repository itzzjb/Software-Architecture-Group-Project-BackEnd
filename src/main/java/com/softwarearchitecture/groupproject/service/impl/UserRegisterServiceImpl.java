package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.UserRegistrationDto;
import com.softwarearchitecture.groupproject.entity.Order;
import com.softwarearchitecture.groupproject.entity.User;
import com.softwarearchitecture.groupproject.entityMapper.UserRegEntityMapper;
import com.softwarearchitecture.groupproject.repository.UserRepository;
import com.softwarearchitecture.groupproject.service.UserRegisterService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserRegisterServiceImpl implements UserRegisterService {

    UserRepository userRepository;


    @Override
    public void userRegistration(UserRegistrationDto userRegistrationDto) {
        User user = UserRegEntityMapper.dtoToEntity(userRegistrationDto);
        userRepository.save(user);
    }

    @Override
    public User findUser(int id) {
        User user = userRepository.findById(id);
        return user;
    }
}
