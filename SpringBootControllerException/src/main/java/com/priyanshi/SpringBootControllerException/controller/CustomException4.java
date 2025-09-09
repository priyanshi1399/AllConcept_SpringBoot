package com.priyanshi.SpringBootControllerException.controller;

import org.springframework.http.HttpStatus;

public class CustomException4 extends RuntimeException {

    CustomException4(HttpStatus status, String message){
        super(message);

    }

}
