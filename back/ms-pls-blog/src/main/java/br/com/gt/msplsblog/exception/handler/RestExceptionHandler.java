package br.com.gt.msplsblog.exception.handler;

import br.com.gt.msplsblog.exception.BadRequestException;
import br.com.gt.msplsblog.exception.BadRequestExceptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<BadRequestExceptionDetails> handlerBadRequestException(BadRequestException bre, HttpServletRequest request){
        return new ResponseEntity<>(
                BadRequestExceptionDetails.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.BAD_REQUEST.value())
                        .title("Bad request Exception")
                        .details(bre.getMessage())
                        .developMessage(bre.getLocalizedMessage())
                        .path(request.getRequestURI())
                        .build(), HttpStatus.BAD_REQUEST);
    }
}
