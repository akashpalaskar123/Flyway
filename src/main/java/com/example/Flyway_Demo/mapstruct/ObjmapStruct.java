package com.example.Flyway_Demo.mapstruct;

import com.example.Flyway_Demo.dto.UserDto;
import com.example.Flyway_Demo.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ObjmapStruct {

    ObjmapStruct INSTANCE = Mappers.getMapper(ObjmapStruct.class);

    User userMapping(UserDto userDto);

}
