package com.cacttus.locationservice.controllers;

import com.cacttus.locationservice.entities.Role;
import com.cacttus.locationservice.services.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/roles")
@RequiredArgsConstructor
public class RoleController {
    private final RoleService service;

    @GetMapping
    public List<Role> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Role getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Role insert(@RequestBody Role role) {
        return service.add(role);
    }

    @PutMapping("/{id}")
    public Role update(@RequestBody Role role, @PathVariable Integer id) {
        return service.modify(id, role);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.removeById(id);
    }
}
