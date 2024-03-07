package com.cacttus.locationservice.infrastrucutures;

public interface ReadService<T, ID> extends FindAllService<T>, FindOneService<T, ID> {
}
