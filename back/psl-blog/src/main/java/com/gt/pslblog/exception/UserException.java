package com.gt.pslblog.exception;

import com.gt.pslblog.enums.UserExceptionEnum;
import lombok.Getter;

@Getter
public class UserException extends Exception {

    private UserExceptionEnum status;

    public UserException(UserExceptionEnum status, String message){
        super(message);
        this.status = status;
    }

    public UserException(UserExceptionEnum status) {
        super(status.getMessage());
        this.status = status;
    }
}
