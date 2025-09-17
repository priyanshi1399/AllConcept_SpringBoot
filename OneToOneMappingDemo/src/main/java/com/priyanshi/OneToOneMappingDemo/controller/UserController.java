package com.priyanshi.OneToOneMappingDemo.controller;

import com.priyanshi.OneToOneMappingDemo.entity.UserDetails;
import com.priyanshi.OneToOneMappingDemo.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    UserDetailsService userDetailsService;

    @PostMapping(path="/user")
    public UserDetails insertUser(@RequestBody UserDetails userDetails){
        return userDetailsService.saveUser(userDetails);
    }
}
