package com.cacttus.locationservice.infrastrucutures.exceptions;

public class AlreadyExistException extends ApiRuntimeException{
    public AlreadyExistException() {
    }

    public AlreadyExistException(String message) {
        super(message);
    }
}
