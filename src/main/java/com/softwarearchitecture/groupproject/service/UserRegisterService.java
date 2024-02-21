package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.UserRegistrationDto;
import com.softwarearchitecture.groupproject.entity.User;

import java.util.Optional;

public interface UserRegisterService {
    void userRegistration(UserRegistrationDto userRegistrationDto);

    Optional<User> findUser(int id);
}
