package com.cacttus.locationservice.infrastrucutures.services;

@FunctionalInterface
public interface RemoveService<ID> {
    void removeById(ID id);
}
