package com.priyanshi.SpringBootAsync.controller;

import com.priyanshi.SpringBootAsync.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class UserController {

    @Autowired
    UserService userserviceObj;


    @GetMapping(path="/getuser")
    public String getUser(){
        System.out.println("Inside getUser Method "+Thread.currentThread().getName());
        userserviceObj.getUserObject();
        return null;
    }

}
