package com.example.demo.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(UserUpdateException.class)
    public ResponseEntity<Object> handleInvalidParameter(UserUpdateException ex)
    {
        logger.error("Class " + ex.getClass() + "info " + ex.getMessage());
        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, ex.getMessage());
        return ResponseEntity.badRequest().body(apiError);
    }

    @ExceptionHandler(UserDeleteException.class)
    public ResponseEntity<Object> handleInvalidParameter(UserDeleteException ex)
    {
        logger.error("Class " + ex.getClass() + "info " + ex.getMessage());
        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, ex.getMessage());
        return ResponseEntity.badRequest().body(apiError);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Object> handleInvalidParameter(RuntimeException ex)
    {
        logger.error("Class " + ex.getClass() + "info " + ex.getMessage());
        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, ex.getMessage());
        return ResponseEntity.badRequest().body(apiError);
    }

}
