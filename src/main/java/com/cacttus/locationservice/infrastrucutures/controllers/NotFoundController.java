package com.cacttus.locationservice.infrastrucutures.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotFoundController {
    @RequestMapping(value = "/**")
    public ResponseEntity<String> pathNotFound() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Path not found!");
    }
}
