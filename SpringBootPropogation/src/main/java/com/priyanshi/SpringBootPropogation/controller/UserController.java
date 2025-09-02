package com.priyanshi.SpringBootPropogation.controller;

import com.priyanshi.SpringBootPropogation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class UserController {

    @Autowired
    UserService userServiceObj;

    @GetMapping(path="/updateuser")
    public  String updateUser(){
        userServiceObj.method1();
        userServiceObj.updateUserFromNonTransactionMethod();
        return null;
    }
}
