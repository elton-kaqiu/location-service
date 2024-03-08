package com.cacttus.locationservice.infrastrucutures.services;

@FunctionalInterface
public interface ModifyService<T, ID> {
    T modify(ID id, T item);
}
