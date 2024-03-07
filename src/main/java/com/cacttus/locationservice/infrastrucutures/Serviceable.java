package com.cacttus.locationservice.infrastrucutures;

public interface Serviceable<T, ID> extends WriteService<T, ID>, ReadService<T, ID> {
}
