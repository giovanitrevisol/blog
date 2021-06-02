package com.gt.pslblog.exception;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Data
@Builder
@Slf4j
public class BadRequestExceptionDetails {

    private String title;
    private int status;
    private String details;
    private String developMessage;
    private LocalDateTime timestamp;
    private String path;











































}
