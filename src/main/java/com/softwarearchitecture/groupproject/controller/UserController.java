package com.softwarearchitecture.groupproject.controller;
import com.softwarearchitecture.groupproject.entity.User;
import com.softwarearchitecture.groupproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam int id) {
        return userRepository.findById(id);
    }

    @PostMapping("/user")
    public void addUser(@RequestBody User user) {
        userRepository.save(user);
    }

}
 