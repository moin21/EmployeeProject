package com.example.employeeproject.exception;

/**
 * Custom exception class extending RuntimeException - CustomException.
 */
public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}
