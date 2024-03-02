package com.softwarearchitecture.groupproject.controller;

import com.softwarearchitecture.groupproject.dto.UserLoginDto;
import com.softwarearchitecture.groupproject.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/userLogin")
public class UserLoginController {

    @Autowired
    UserLoginService userLoginService;

    @Autowired
    public UserLoginController(UserLoginService userLoginService) {
        this.userLoginService = userLoginService;
    }

    @PostMapping
    public ResponseEntity<String> userLogin(@RequestBody UserLoginDto userLoginDto) {
        Boolean validity = userLoginService.userLogin(userLoginDto);
        if(validity){
            return ResponseEntity.ok().body("Logging Successfully Completed");
        }else
            return ResponseEntity.status(HttpStatus.LOCKED).body("Invalid User Name Or Password");
      }

    }

