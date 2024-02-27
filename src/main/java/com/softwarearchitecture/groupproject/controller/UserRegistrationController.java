package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.UserRegistrationDto;
import com.softwarearchitecture.groupproject.entity.User;
import com.softwarearchitecture.groupproject.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserRegistrationController {

    @Autowired
    UserRegisterService userRegisterService;

    @Autowired
    public UserRegistrationController(UserRegisterService userRegisterService) {
        this.userRegisterService = userRegisterService;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam int id) {
        return userRegisterService.findUser(id);
    }

    @PostMapping("/user")
    public void addUser(@RequestBody UserRegistrationDto userRegistrationDto) {
        userRegisterService.userRegistration(userRegistrationDto);
    }

}
 
