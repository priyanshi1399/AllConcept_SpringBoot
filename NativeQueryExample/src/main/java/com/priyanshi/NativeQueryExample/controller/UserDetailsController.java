package com.priyanshi.NativeQueryExample.controller;


import com.priyanshi.NativeQueryExample.entity.UserDetails;
import com.priyanshi.NativeQueryExample.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class UserDetailsController {


    @Autowired
    UserDetailsService userDetailsService;

    @PostMapping(path="/user")
    public UserDetails saveUser(@RequestBody UserDetails user){
        return userDetailsService.saveUser(user);
    }

    @GetMapping(path="/user")
    public List<UserDetails> getUserDetailsByName(@RequestParam String name){
        return userDetailsService.getUserDetailsByName(name);
    }
}
