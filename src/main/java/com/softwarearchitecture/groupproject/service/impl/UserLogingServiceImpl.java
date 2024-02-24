package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.UserLoginDto;
import com.softwarearchitecture.groupproject.entity.User;
import com.softwarearchitecture.groupproject.repository.UserRepository;
import com.softwarearchitecture.groupproject.service.UserLogingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserLogingServiceImpl implements UserLogingService {
    UserRepository userRepository;

    @Override

    public Boolean userLogging(UserLoginDto userLoginDto) {
        String email = userLoginDto.getEmail();
        User user = userRepository.findByEmail(email);

        //Password Validation
        if (Objects.equals(userLoginDto.getPassword() , user.getPassword())){
            return true;
        }else
            return false;
    }
}
