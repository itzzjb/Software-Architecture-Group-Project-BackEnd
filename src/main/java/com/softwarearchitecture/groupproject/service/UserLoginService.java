package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.UserLoginDto;

public interface UserLoginService {
    Boolean userLogin(UserLoginDto userLoginDto);
}
