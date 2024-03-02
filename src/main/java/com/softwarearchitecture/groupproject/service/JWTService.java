package com.softwarearchitecture.groupproject.service;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.Map;

public interface JWTService {
    String generateRefreshToken(Map<String, Object> extraClaims, UserDetails userDetails);
    String extractUsername(String token);
    String generateToken(UserDetails userDetails);
    boolean isTokenValid(String token, UserDetails userDetails);

}
