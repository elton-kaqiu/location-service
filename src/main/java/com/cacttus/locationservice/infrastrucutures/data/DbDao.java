package com.cacttus.locationservice.infrastrucutures.data;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface DbDao {
    <T> List<T> getResultFromProcedure(
            String procedureName,
            Map<String, Object> inParams,
            Map<String, Object> outParams,
            Class className
    );

    <T> List<T> getResultFromQuery(
            String query,
            Map<String, Object> inParams,
            Class className
            );

}
