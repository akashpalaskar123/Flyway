package com.example.Flyway_Demo.service;

import com.example.Flyway_Demo.dto.UserDto;
import com.example.Flyway_Demo.entities.User;
import com.example.Flyway_Demo.mapstruct.ObjmapStruct;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    public static User saveUser(UserDto userDto) {

        User user = ObjmapStruct.INSTANCE.userMapping(userDto);
        System.out.println(user);
        return user;
    }

}
