package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.UserRegistrationDto;
import com.softwarearchitecture.groupproject.entity.User;
import com.softwarearchitecture.groupproject.entityMapper.UserRegEntityMapper;
import com.softwarearchitecture.groupproject.repository.UserRepository;
import com.softwarearchitecture.groupproject.service.UserRegisterService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController

public class UserRegisterController {

    UserRegisterService userRegisterService;


    @PostMapping("/userRegister")
    public void addUser(@RequestBody UserRegistrationDto userRegistrationDto) {
        userRegisterService.userRegisration(userRegistrationDto);
    }

}
 
