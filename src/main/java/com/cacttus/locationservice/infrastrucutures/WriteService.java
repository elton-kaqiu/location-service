package com.cacttus.locationservice.infrastrucutures;

public interface WriteService<T, ID> extends AddService<T>, ModifyService<T, ID>, RemoveService<ID> {
}
