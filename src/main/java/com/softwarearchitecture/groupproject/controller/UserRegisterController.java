package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.UserRegistrationDto;
import com.softwarearchitecture.groupproject.entity.User;
import com.softwarearchitecture.groupproject.service.UserRegisterService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@AllArgsConstructor
@RestController

public class UserRegisterController {

    UserRegisterService userRegisterService;

    @GetMapping("/user")
    public Optional<User> getUser(@RequestParam int id) {
        return userRegisterService.findUser(id);
    }

    @PostMapping("/user")
    public void addUser(@RequestBody UserRegistrationDto userRegistrationDto) {
        userRegisterService.userRegistration(userRegistrationDto);
    }

}
 
