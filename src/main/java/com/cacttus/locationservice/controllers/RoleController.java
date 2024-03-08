package com.cacttus.locationservice.controllers;

import com.cacttus.locationservice.dtos.RoleDto;
import com.cacttus.locationservice.entities.Role;
import com.cacttus.locationservice.infrastrucutures.controllers.BaseController;
import com.cacttus.locationservice.mappers.RoleMapper;
import com.cacttus.locationservice.services.RoleService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/roles")
public class RoleController extends BaseController<Role, Integer, RoleDto> {

    public RoleController(RoleService service, RoleMapper mapper) {
        super(service, mapper);
    }
}
