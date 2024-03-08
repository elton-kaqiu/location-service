package com.cacttus.locationservice.infrastrucutures;

public interface Convertable<TEntity, TDto> {
    TEntity toEntity(TDto dto);

    TDto toDto(TEntity entity);
}
