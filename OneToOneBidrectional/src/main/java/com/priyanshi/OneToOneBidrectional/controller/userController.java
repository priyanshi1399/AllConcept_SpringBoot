package com.priyanshi.OneToOneBidrectional.controller;


import com.priyanshi.OneToOneBidrectional.entity.UserDetails;
import com.priyanshi.OneToOneBidrectional.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class userController {


    @Autowired
    UserDetailsService userDetailsService;


    @PostMapping(path = "/user")
    public UserDetails insertUser(@RequestBody UserDetails userDetails) {
        return userDetailsService.saveUser(userDetails);
    }
}