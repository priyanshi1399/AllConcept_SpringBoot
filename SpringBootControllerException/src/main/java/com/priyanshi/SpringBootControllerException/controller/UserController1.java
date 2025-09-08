package com.priyanshi.SpringBootControllerException.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class UserController1 {

    @GetMapping(path="/get-user1")
    public ResponseEntity<?> getUser(){
        throw new CustomException(HttpStatus.BAD_REQUEST,"userId is missing");
    }

    @GetMapping(path="/get-user-history1")
    public ResponseEntity<?> getUserHistory(){
        throw new IllegalArgumentException("Inappropriate argument passed");
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<String> handleCustomException(CustomException ex){
        return new ResponseEntity<>(ex.getMessage(),ex.getStatus());
    }
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleCustomException(IllegalArgumentException ex){
        return new ResponseEntity<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
    }


}
