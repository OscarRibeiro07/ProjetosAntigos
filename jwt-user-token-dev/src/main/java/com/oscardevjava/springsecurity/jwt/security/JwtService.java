package com.oscardevjava.springsecurity.jwt.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JwtService {
    private  final JwtEncoder jwtEncoder;
}
