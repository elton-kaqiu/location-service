package com.cacttus.locationservice.infrastrucutures.services;

import java.util.List;

@FunctionalInterface
public interface FindAllService<T> {
    List<T> findAll();
}
