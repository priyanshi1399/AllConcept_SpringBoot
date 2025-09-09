package com.priyanshi.SpringBootControllerException.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api")
public class BothExcepetionUserController {

    @GetMapping(path="/get-user-4")
    public ResponseEntity<?> getUser(){

        throw new CustomException4(HttpStatus.INTERNAL_SERVER_ERROR,"user Id is missing");
    }

    @ExceptionHandler(CustomException4.class)
    @ResponseStatus(value=HttpStatus.BAD_REQUEST)
    public ResponseEntity<Object> handleCustomException(CustomException e){
        return new ResponseEntity<>("you are not authorized",HttpStatus.FORBIDDEN);
    }
}
