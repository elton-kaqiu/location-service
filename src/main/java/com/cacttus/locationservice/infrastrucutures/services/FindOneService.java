package com.cacttus.locationservice.infrastrucutures.services;

@FunctionalInterface
public interface FindOneService<T, ID> {
    T findById(ID id);
}
