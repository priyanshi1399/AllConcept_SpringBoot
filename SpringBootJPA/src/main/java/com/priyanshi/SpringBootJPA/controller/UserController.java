package com.priyanshi.SpringBootJPA.controller;

import com.priyanshi.SpringBootJPA.entity.User;
import com.priyanshi.SpringBootJPA.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    UserService userService;

    @GetMapping(path="/get-user-spring-jdbc")
    public List<User> getUserWithSpringJDBC(){
        userService.createTable();
        userService.insertUser("Priyanshi",26);
        userService.insertUser("Amy",25);
        return userService.getUsers();

    }
}
