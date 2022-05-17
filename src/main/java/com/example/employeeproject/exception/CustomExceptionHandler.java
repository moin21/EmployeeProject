package com.example.employeeproject.exception;

import com.example.employeeproject.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Controller Advice Class - CustomExceptionHandler
 */
@ControllerAdvice
public class CustomExceptionHandler {
    /**
     * @param exception - exception object from CustomException Class.
     * @return - ResponseEntity consisting response DTO and Status Code.
     */
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ResponseDTO> handleMethodArgumentNotValidException(CustomException exception) {
        ResponseDTO responseDTO = new ResponseDTO("Exception while parsing Rest request", exception.getMessage());
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.BAD_REQUEST);
    }
}
