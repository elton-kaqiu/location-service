package com.cacttus.locationservice.controllers;

import com.cacttus.locationservice.dtos.UserDto;
import com.cacttus.locationservice.entities.User;
import com.cacttus.locationservice.infrastrucutures.controllers.BaseController;
import com.cacttus.locationservice.mappers.UserMapper;
import com.cacttus.locationservice.services.UserService;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/users")

public class UserController extends BaseController<User, Long, UserDto> {
    public UserController(UserService service, UserMapper mapper) {
        super(service, mapper);
    }
}
