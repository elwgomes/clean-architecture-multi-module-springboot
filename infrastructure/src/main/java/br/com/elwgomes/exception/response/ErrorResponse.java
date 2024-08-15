package br.com.elwgomes.exception.response;

import lombok.Getter;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public class ErrorResponse {
  private HttpStatus status;
  private String message;
}
