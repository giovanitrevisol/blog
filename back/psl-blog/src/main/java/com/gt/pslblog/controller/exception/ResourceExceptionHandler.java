package com.gt.pslblog.controller.exception;

import com.gt.pslblog.enums.UserExceptionEnum;
import com.gt.pslblog.exception.UserException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;


@Slf4j
@RestControllerAdvice
public class ResourceExceptionHandler {


    //@ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler(UserException.class)
    public ErrorRepresentation userException(UserException ex){
        log.error(ex.getMessage());
        return ErrorRepresentation.builder()
                .status(ex.getStatus())
                .messagem(ex.getStatus().getMessage())
                .dateTime(LocalDateTime.now())
                .build();
    }


    //@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ErrorRepresentation InternalException(Exception ex){
        log.error(ex.getMessage());
        return ErrorRepresentation.builder()
                .status(UserExceptionEnum.ERRO_INTERNO)
                .messagem(UserExceptionEnum.ERRO_INTERNO.getMessage())
                .dateTime(LocalDateTime.now())
                .build();
    }

}
