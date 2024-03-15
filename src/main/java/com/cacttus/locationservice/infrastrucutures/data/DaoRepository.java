package com.cacttus.locationservice.infrastrucutures.data;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.procedure.ProcedureCall;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Repository
public class DaoRepository implements DbDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public <T> List<T> getResultFromProcedure(String procedureName, Map<String, Object> inParams, Map<String, Object> outParams, Class className) {
        Session session = entityManager.unwrap(Session.class);//create session with db connection
        ProcedureCall procedureCall = session.createStoredProcedureCall(procedureName, className);//create a procedure like: CALL sp_test (?,?)
        //add params dynamic way
        addParameters(procedureCall, inParams, outParams);
        var resultSet = (List<T>) procedureCall.getResultList();
        session.close();
        return resultSet;
    }

    @Override
    public <T> List<T> getResultFromQuery(String query, Map<String, Object> inParams, Class className) {
        Session session = entityManager.unwrap(Session.class);//create session with db connection
        Query nativeQuery = session.createNativeQuery(query, className);
        //add params dynamic way
        var resultSet = (List<T>) nativeQuery.getResultList();
        session.close();
        return resultSet;
    }

    private void addParameters(ProcedureCall procedureCall, Map<String, Object> inParams, Map<String, Object> outParams) {
        addParameters(procedureCall, inParams, ParameterMode.IN);
        addParameters(procedureCall, outParams, ParameterMode.OUT);
    }

    private void addParameters(ProcedureCall procedureCall, Map<String, Object> params, ParameterMode parameterMode) {
        if (params != null && !params.isEmpty()) {
            for (String key : params.keySet()) {
                Object value = params.get(key);
                if (value != null) {
                    procedureCall.registerParameter(key, value.getClass(), parameterMode);
                    procedureCall.setParameter(key, value);
                }
            }
        }
    }
}
