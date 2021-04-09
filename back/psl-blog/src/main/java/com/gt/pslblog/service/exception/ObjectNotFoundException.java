package com.gt.pslblog.service.exception;

public class ObjectNotFoundException extends  RuntimeException{

    public ObjectNotFoundException(String message) {
        super(message);
    }

    public ObjectNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
