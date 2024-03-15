package com.cacttus.locationservice.infrastrucutures.exceptions;

public class NotFoundException extends ApiRuntimeException{
    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }
}
