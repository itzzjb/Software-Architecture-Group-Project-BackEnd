package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.UserRegistrationDto;
import com.softwarearchitecture.groupproject.entity.User;
import com.softwarearchitecture.groupproject.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserRegistrationController {

    @Autowired
    UserRegisterService userRegisterService;

    @Autowired
    public UserRegistrationController(UserRegisterService userRegisterService) {
        this.userRegisterService = userRegisterService;
    }

    @GetMapping
    public User getUser(@RequestParam int id) {
        return userRegisterService.getUserById(id);
    }

    @PostMapping
    public ResponseEntity<UserRegistrationDto> addUser(@RequestBody UserRegistrationDto userRegistrationDto) {
        UserRegistrationDto savedUserRegistrationDto = userRegisterService.createUser(userRegistrationDto);
        return new ResponseEntity<>(savedUserRegistrationDto, HttpStatus.CREATED);
    }

}
 
