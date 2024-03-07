package com.cacttus.locationservice.infrastrucutures;

@FunctionalInterface
public interface AddService<T> {
    T add(T item);
}
