package br.com.elwgomes.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.elwgomes.exception.InvalidAnimalDataException;
import br.com.elwgomes.exception.response.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
  @ExceptionHandler(InvalidAnimalDataException.class)
  public ResponseEntity<ErrorResponse> handleInvalidAnimalDataException(InvalidAnimalDataException ex) {
    return new ResponseEntity<>(new ErrorResponse(HttpStatus.BAD_REQUEST, ex.getMessage()),
        HttpStatus.BAD_REQUEST);
  }
}
