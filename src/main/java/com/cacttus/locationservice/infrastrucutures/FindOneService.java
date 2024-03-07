package com.cacttus.locationservice.infrastrucutures;

@FunctionalInterface
public interface FindOneService<T, ID> {
    public T findById(ID id);
}
