package com.priyanshi.SpringBootControllerException.controller;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class CustomException extends RuntimeException{


  HttpStatus status;
  String message;

    public CustomException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
