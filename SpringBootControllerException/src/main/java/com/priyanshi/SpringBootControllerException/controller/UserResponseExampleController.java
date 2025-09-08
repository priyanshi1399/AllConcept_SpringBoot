package com.priyanshi.SpringBootControllerException.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class UserResponseExampleController {

    @GetMapping(path="/get-user3")
    public ResponseEntity<?> getUser() throws CustomException2 {
        throw new CustomException2("user Id is missing");

    }
}
