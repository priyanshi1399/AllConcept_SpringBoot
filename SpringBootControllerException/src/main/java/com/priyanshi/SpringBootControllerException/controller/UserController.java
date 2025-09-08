package com.priyanshi.SpringBootControllerException.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.priyanshi.SpringBootControllerException.controller.ApiErrorResponse;
import java.util.Date;

@RestController
@RequestMapping(value="/api")
public class UserController {

    /*@GetMapping(path="/get-user")
    public ResponseEntity<?> getUser(){
        try{
            throw new CustomException(HttpStatus.BAD_REQUEST,"userId is missing");
        }
        catch(CustomException e){
        ApiErrorResponse errorResponse=new ApiErrorResponse(new Date(),e.getMessage(),e.getStatus().value());
        return new ResponseEntity<>(errorResponse,e.getStatus());
        }
        catch(Exception e){
            ApiErrorResponse errorResponse=new ApiErrorResponse(new Date(),e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR.value());
            return new ResponseEntity<>(errorResponse,HttpStatus.INTERNAL_SERVER_ERROR);
        }*/

    @GetMapping(path="/get-user")
    public ResponseEntity<?> getUser(){

            throw new CustomException(HttpStatus.BAD_REQUEST,"userId is missing");
        }
        @ExceptionHandler(CustomException.class)
    public  ResponseEntity<String> handleCustomException(CustomException ex){
        return new ResponseEntity<>(ex.getMessage(),ex.getStatus());
    }

}
