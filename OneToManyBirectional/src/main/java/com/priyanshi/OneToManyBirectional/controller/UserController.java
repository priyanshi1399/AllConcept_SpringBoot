package com.priyanshi.OneToManyBirectional.controller;


import com.priyanshi.OneToManyBirectional.entity.UserDetails;
import com.priyanshi.OneToManyBirectional.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api")
public class UserController {

    @Autowired
    private UserDetailsService userDetailsService;

    @PostMapping("/user")
    public UserDetails createUser(@RequestBody UserDetails user) {
        return userDetailsService.saveUser(user);
    }

    @GetMapping("/user/{id}")
    public UserDetails createUser(@PathVariable Long id) {
        return userDetailsService.findById(id);

    }
}
