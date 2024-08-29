package com.example.Flyway_Demo.controller;

import com.example.Flyway_Demo.dto.UserDto;
import com.example.Flyway_Demo.entities.User;
import com.example.Flyway_Demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class USerControlelr {

    @Autowired
    UserService userService;

    @GetMapping("/getuser")
    public User getuser(UserDto userDto){
        System.out.println(userDto);


        User user = userService.saveUser(userDto);
        return  user;


    }
}
