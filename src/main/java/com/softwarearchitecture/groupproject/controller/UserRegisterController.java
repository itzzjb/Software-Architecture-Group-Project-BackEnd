package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.UserRegistrationDto;
import com.softwarearchitecture.groupproject.service.UserRegisterService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController

public class UserRegisterController {

    UserRegisterService userRegisterService;


    @PostMapping("/user")
    public void addUser(@RequestBody UserRegistrationDto userRegistrationDto) {
        userRegisterService.userRegistration(userRegistrationDto);
    }

}
 
