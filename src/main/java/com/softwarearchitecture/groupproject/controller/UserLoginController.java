package com.softwarearchitecture.groupproject.controller;

import com.softwarearchitecture.groupproject.dto.UserLoginDto;
import com.softwarearchitecture.groupproject.service.UserLogingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserLoginController {

    @Autowired
    UserLogingService userLogingService;

    @Autowired
    public UserLoginController(UserLogingService userLogingService) {
        this.userLogingService = userLogingService;
    }

    @GetMapping("/userLogin")
    public ResponseEntity<String> userLogin(@RequestBody UserLoginDto userLoginDto) {
        Boolean validity = userLogingService.userLogging(userLoginDto);
        if(validity){
            return ResponseEntity.ok().body("Logging Successfully Completed");
        }else
            return ResponseEntity.status(HttpStatus.LOCKED).body("Invalid User Name Or Password");
      }

    }

