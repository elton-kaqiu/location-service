package com.cacttus.locationservice.infrastrucutures;

import java.util.List;

@FunctionalInterface
public interface FindAllService<T> {
    List<T> findAll();
}
