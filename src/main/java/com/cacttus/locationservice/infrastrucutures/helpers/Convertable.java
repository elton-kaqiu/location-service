package com.cacttus.locationservice.infrastrucutures.helpers;

public interface Convertable<TEntity, TDto> {
    TEntity toEntity(TDto dto);

    TDto toDto(TEntity entity);
}
