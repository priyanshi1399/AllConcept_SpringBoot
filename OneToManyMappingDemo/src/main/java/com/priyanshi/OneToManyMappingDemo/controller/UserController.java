package com.priyanshi.OneToManyMappingDemo.controller;

import com.priyanshi.OneToManyMappingDemo.entity.UserDetails;
import com.priyanshi.OneToManyMappingDemo.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserDetailsService userDetailsService;

    @PostMapping("/user")
    public UserDetails createUser(@RequestBody UserDetails user) {
        return userDetailsService.saveUser(user);
    }

    @GetMapping("/user/{id}")
    public UserDetails createUser(@PathVariable Long id) {
        UserDetails output=userDetailsService.findById(id);
        output.getOrderDetails().remove(0);
         userDetailsService.saveUser(output);
        return output;
    }
}