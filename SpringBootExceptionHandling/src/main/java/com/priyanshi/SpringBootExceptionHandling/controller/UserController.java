package com.priyanshi.SpringBootExceptionHandling.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class UserController {

    @GetMapping(path="/get-user")
    public String getUser(){

        throw new CustomException(HttpStatus.BAD_REQUEST,
                "request is not correct,userID is missing");
    }

}
