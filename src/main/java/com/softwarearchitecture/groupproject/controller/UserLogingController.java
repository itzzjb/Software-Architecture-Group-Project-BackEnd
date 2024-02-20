package com.softwarearchitecture.groupproject.controller;

import com.softwarearchitecture.groupproject.dto.UserLoginDto;
import com.softwarearchitecture.groupproject.service.UserLogingService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class UserLogingController {

    UserLogingService userLogingService;

    @GetMapping("/userLogin")
    public ResponseEntity<String> userLogin(@RequestBody UserLoginDto userLoginDto) {
        Boolean validity = userLogingService.userLogging(userLoginDto);
        if(validity){
            return ResponseEntity.ok().body("Logging Successfully Completed");
        }else
            return ResponseEntity.status(HttpStatus.LOCKED).body("Invaild User Name Or Password");
      }
    }

