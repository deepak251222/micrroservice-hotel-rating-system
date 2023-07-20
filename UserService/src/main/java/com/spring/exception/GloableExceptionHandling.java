package com.spring.exception;


import com.spring.payload.ApiRespose;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GloableExceptionHandling {

    @ExceptionHandler(GloableHandlingException.class)
    public ResponseEntity<ApiRespose> handlerResourceNotFound(GloableHandlingException ex)
    {
    String message = ex.getMessage();
      ApiRespose apiRepose = ApiRespose.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<ApiRespose>(apiRepose,HttpStatus.NOT_FOUND);
    }

}
