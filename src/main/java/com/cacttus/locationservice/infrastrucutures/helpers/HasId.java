package com.cacttus.locationservice.infrastrucutures.helpers;
//who ever implements it should have id
@FunctionalInterface
public interface HasId<ID> {

    ID getId();
}
