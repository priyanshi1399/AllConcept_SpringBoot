package com.priyanshi.SpringBootLearningTransactional.controller;

import com.priyanshi.SpringBootLearningTransactional.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class UserController {

    @Autowired
    User user;

    @GetMapping(path="/updateuser")
    public String updateUser(){
        user.updateUser();
        return "user is updated successfully";
    }

}
