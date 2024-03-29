package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.dto.CartDto;
import com.softwarearchitecture.groupproject.dto.UserDto;
import com.softwarearchitecture.groupproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable("id") int userId) {
        UserDto userDto = userService.findUser(userId);
        return ResponseEntity.ok(userDto);
    }

    @PostMapping
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto) {
        UserDto savedUserDto = userService.createUser(userDto);
        return new ResponseEntity<>(savedUserDto, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        List<UserDto> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @PutMapping("{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("id") int userId, @RequestBody UserDto updatedUserDto) {
        UserDto userDto = userService.updateUser(userId, updatedUserDto);
        return ResponseEntity.ok(userDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCart(@PathVariable("id") int userId) {
        userService.deleteUser(userId);
        return ResponseEntity.ok("User deleted successfully.");
    }

}
 
