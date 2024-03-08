package com.cacttus.locationservice.infrastrucutures.services;

public interface WriteService<T, ID> extends AddService<T>, ModifyService<T, ID>, RemoveService<ID> {
}
