package com.gt.pslblog.controller.exception;

import com.gt.pslblog.enums.UserExceptionEnum;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorRepresentation {
    private UserExceptionEnum status;
    private String messagem;
    private LocalDateTime dateTime;
}
