package com.micro.inventorytracker.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;

import javax.persistence.EntityNotFoundException;

@RestControllerAdvice(basePackages = "com.micro.inventorytracker.controller")
public class ConrtollerExceptionHandler{

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = HttpClientErrorException.BadRequest.class)
    public ErrorMessage resourceNotFoundException(HttpClientErrorException.BadRequest exception, WebRequest request) {
        return ErrorMessage.builder()
                .message(exception.getMessage())
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .build();

    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = EntityNotFoundException.class)
    public ErrorMessage resourceNotFoundException(EntityNotFoundException exception, WebRequest request) {
        return ErrorMessage.builder()
                .message(exception.getMessage())
                .statusCode(HttpStatus.NOT_FOUND.value())
                .build();

    }
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = InternalError.class)
    public ErrorMessage handleMiExcepcion(InternalError exception, WebRequest request) {
        return ErrorMessage.builder()
                .message(exception.getMessage())
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .build();
    }

}