package com.cacttus.locationservice.infrastrucutures;

@FunctionalInterface
public interface FindOneService<T, ID> {
    T findById(ID id);
}
