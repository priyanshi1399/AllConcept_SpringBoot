package com.priyanshi.SpringBootCustomResponseEntity.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;

import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value="/api")
public class UserController {

    @GetMapping(path = "/get-user")
    public ResponseEntity<?> getUser() {
       try {
           throw new CustomException(HttpStatus.BAD_REQUEST,"userId is missing");
       }
       catch(CustomException e){

        ApiErrorResponse errorResponse=new ApiErrorResponse(new Date(),e.getMessage(),e.getStatus().value());
        return new ResponseEntity<>(errorResponse,e.getStatus());

       } catch (Exception e) {

          ApiErrorResponse errorResponse=new ApiErrorResponse(new Date(),e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR.value());
          return new ResponseEntity<>(errorResponse,HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }
}