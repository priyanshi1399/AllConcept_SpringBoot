package com.example.N._ExampleSpringBoot.controller;

import com.example.N._ExampleSpringBoot.entity.UserDetails;
import com.example.N._ExampleSpringBoot.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/api")
public class UserDetailsController {

    @Autowired
    UserDetailsService userDetailsService;

    @PostMapping("/user")
    public UserDetails saveUser(@RequestBody UserDetails user){
        return userDetailsService.saveUser(user);
    }

    @GetMapping("/user")
    public List<UserDetails> findUserBYName(@RequestParam String name){
      return userDetailsService.findNameWithAddress(name);

    }

}
