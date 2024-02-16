package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.UserRegistrationDto;
import com.softwarearchitecture.groupproject.entity.User;
import com.softwarearchitecture.groupproject.entityMapper.UserRegEntityMapper;
import com.softwarearchitecture.groupproject.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserRegisterServiceImplementation implements UserRegisterService {

    UserRepository userRepository;


    @Override
    public void userRegisration(UserRegistrationDto userRegistrationDto) {
        User user = UserRegEntityMapper.dtoToEntity(userRegistrationDto);
        userRepository.save(user);
    }
}
