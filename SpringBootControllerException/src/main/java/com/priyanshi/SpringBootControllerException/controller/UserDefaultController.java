package com.priyanshi.SpringBootControllerException.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value="/api")
public class UserDefaultController {

    @GetMapping(path="/get-user2")
    public ResponseEntity<?> getUser(){
        throw new CustomException(HttpStatus.BAD_REQUEST,"userId is missing");
    }

    @GetMapping(path="/get-user-history2")
    public ResponseEntity<?> getUserHistory(){
        throw new IllegalArgumentException(("inappropriate arguments passed"));
    }

    @ExceptionHandler(CustomException.class)
    public void handleCustomException(HttpServletResponse response, CustomException ex) throws IOException {
        response.sendError(HttpStatus.BAD_REQUEST.value(),ex.message);
    }



}
