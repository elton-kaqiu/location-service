package com.cacttus.locationservice.infrastrucutures.services;

@FunctionalInterface
public interface AddService<T> {
    T add(T item);
}
