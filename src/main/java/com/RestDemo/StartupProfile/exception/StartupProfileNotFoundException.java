package com.RestDemo.StartupProfile.exception;

public class StartupProfileNotFoundException extends RuntimeException {
    public StartupProfileNotFoundException(String message) {
        super(message);
    }
    public StartupProfileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
