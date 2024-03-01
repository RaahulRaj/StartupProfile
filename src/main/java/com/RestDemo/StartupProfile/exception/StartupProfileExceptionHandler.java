package com.RestDemo.StartupProfile.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StartupProfileExceptionHandler {
    @ExceptionHandler(value = {StartupProfileNotFoundException.class})
    public ResponseEntity<Object> handleStartupProfileNotFoundException(StartupProfileNotFoundException startupProfileNotFoundException){
        StartupProfileException startProfileException = new StartupProfileException(
                startupProfileNotFoundException.getMessage(),
                startupProfileNotFoundException.getCause(),
        HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(startProfileException,HttpStatus.NOT_FOUND);
    }
}
