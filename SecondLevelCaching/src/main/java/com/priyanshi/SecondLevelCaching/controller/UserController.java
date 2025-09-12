package com.priyanshi.SecondLevelCaching.controller;

import com.priyanshi.SecondLevelCaching.entity.UserDetails;
import com.priyanshi.SecondLevelCaching.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api")
public class UserController {

    @Autowired
    UserDetailsService userDetailsService;

    @PostMapping(path="/user")
    public UserDetails addUserDetails(@RequestBody UserDetails user) {
      return userDetailsService.saveUser(user);

    }

    @GetMapping(path = "/user")
    public UserDetails getUserDetails() {
        return userDetailsService.findByID(1L);
    }

    @PutMapping(path="/user/{id}")
    public UserDetails updateUser(@PathVariable Long id,@RequestBody UserDetails updatedUser){
        updatedUser.setId(id);
        return userDetailsService.saveUser(updatedUser);

    }






}
