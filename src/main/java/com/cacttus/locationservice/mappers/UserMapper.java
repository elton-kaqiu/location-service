package com.cacttus.locationservice.mappers;

import com.cacttus.locationservice.dtos.UserDto;
import com.cacttus.locationservice.entities.User;
import com.cacttus.locationservice.infrastrucutures.helpers.Convertable;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper extends Convertable<User, UserDto> {
    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);
}
