package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.JwtAuthenticationResponse;
import com.softwarearchitecture.groupproject.dto.RefreshTokenRequest;
import com.softwarearchitecture.groupproject.dto.UserDto;
import com.softwarearchitecture.groupproject.dto.UserLoginDto;
import com.softwarearchitecture.groupproject.entity.User;

public interface AuthenticationService {
    public User signUp(UserDto userDto);
    public JwtAuthenticationResponse signIn(UserLoginDto userLoginDto);
    public JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
