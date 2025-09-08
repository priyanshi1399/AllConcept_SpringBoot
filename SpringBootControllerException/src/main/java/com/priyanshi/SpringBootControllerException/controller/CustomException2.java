package com.priyanshi.SpringBootControllerException.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST,reason="Invalid Request Passed")
public class CustomException2 extends RuntimeException {

    //HttpStatus status;

    public CustomException2(String message) {
        super(message);
       // this.status=status;

    }


}
