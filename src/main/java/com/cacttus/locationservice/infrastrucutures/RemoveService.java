package com.cacttus.locationservice.infrastrucutures;

@FunctionalInterface
public interface RemoveService<ID> {
    void removeById(ID id);
}
