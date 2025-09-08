package com.priyanshi.SpringBootControllerException.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class UserGlobalExampleController {

    @GetMapping(path="/get-userExample")
    public ResponseEntity<?> GetUser(){

        throw new CustomException(HttpStatus.BAD_REQUEST,"User id is missing");
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<String> handleCustomException(CustomException ex){
        return new ResponseEntity<>(ex.message +" from Controller ExceptionHandler", ex.getStatus());
    }
}
