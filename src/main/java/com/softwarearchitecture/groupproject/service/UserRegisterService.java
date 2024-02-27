package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.UserRegistrationDto;
import com.softwarearchitecture.groupproject.entity.User;

public interface UserRegisterService {
    void createUser(UserRegistrationDto userRegistrationDto);

    User findUser(int id);
}
