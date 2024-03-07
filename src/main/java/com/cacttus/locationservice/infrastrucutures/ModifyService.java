package com.cacttus.locationservice.infrastrucutures;

@FunctionalInterface
public interface ModifyService<T, ID> {
    T modify(ID id, T item);
}
