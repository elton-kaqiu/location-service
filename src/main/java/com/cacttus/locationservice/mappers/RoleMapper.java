package com.cacttus.locationservice.mappers;

import com.cacttus.locationservice.dtos.RoleDto;
import com.cacttus.locationservice.entities.Role;
import com.cacttus.locationservice.infrastrucutures.Convertable;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RoleMapper extends Convertable<Role, RoleDto> {
    RoleMapper MAPPER = Mappers.getMapper(RoleMapper.class);
}
