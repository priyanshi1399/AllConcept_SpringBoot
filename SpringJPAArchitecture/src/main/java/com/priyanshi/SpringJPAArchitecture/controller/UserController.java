package com.priyanshi.SpringJPAArchitecture.controller;


import com.priyanshi.SpringJPAArchitecture.entity.UserDetails;
import com.priyanshi.SpringJPAArchitecture.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class UserController {

    @Autowired
    UserDetailsService userdetailsservice;


    @GetMapping(path="/test-jpa")
    public UserDetails getUserDetails(){
        UserDetails userDetails=new UserDetails("Priyanshi","priyanshitomar4@gmail.com");
        userdetailsservice.saveUser(userDetails);
        return userdetailsservice.findByID(1L);
    }


    @GetMapping(path="/read-jpa")
    public UserDetails getUser2(){
        userdetailsservice.findByID(1L);
        return userdetailsservice.findByID(1L);
    }


}
