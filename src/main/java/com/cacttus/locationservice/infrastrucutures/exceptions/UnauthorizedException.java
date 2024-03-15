package com.cacttus.locationservice.infrastrucutures.exceptions;

public class UnauthorizedException extends ApiRuntimeException{
    public UnauthorizedException() {
    }

    public UnauthorizedException(String message) {
        super(message);
    }
}
