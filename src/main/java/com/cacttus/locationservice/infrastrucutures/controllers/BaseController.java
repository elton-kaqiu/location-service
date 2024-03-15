package com.cacttus.locationservice.infrastrucutures.controllers;

import com.cacttus.locationservice.infrastrucutures.services.BaseService;
import com.cacttus.locationservice.infrastrucutures.helpers.Convertable;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
public abstract class BaseController<TEntity, ID, TDto> {
    private final BaseService<TEntity, ID> service;
    private final Convertable<TEntity, TDto> mapper;

    @GetMapping
    public ResponseEntity<List<TDto>> findAll() {
        var entities = service.findAll();
        return ResponseEntity.ok(entities.stream().map(mapper::toDto).toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TDto> findById(@PathVariable ID id) {
        var entity = service.findById(id);
        return ResponseEntity.ok(mapper.toDto(entity));
    }

    @PostMapping
    public ResponseEntity<TDto> add(@RequestBody TDto dto) {
        var entity = mapper.toEntity(dto);
        entity = service.add(entity);
        return ResponseEntity.ok(mapper.toDto(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TDto> modify(@PathVariable ID id, @RequestBody TDto dto) {
        //validation in next lecture, add an interface HasId
        var entity = mapper.toEntity(dto);
        entity = service.modify(id, entity);
        return ResponseEntity.ok(mapper.toDto(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> removeById(@PathVariable ID id) {
        service.removeById(id);
        return ResponseEntity.noContent().build();
    }

}
