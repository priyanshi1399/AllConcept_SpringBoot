package com.priyanshi.JPQLExample.controller;


import com.priyanshi.JPQLExample.DTO.UserDTO;
import com.priyanshi.JPQLExample.entity.UserDetails;
import com.priyanshi.JPQLExample.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class UserController {

    @Autowired
    UserDetailsService userDetailsService;

    @PostMapping(path="/user")
    public UserDetails saveUser(@RequestBody UserDetails userDetails){
        return userDetailsService.saveUser(userDetails);
    }

    /*
    @GetMapping(path="/user")
    public ResponseEntity<List<UserDetails>> getDetailsByAddress(@RequestParam String name){
        List<UserDetails> user=userDetailsService.getUserByAddress(name);
        return ResponseEntity.ok(user);
    }*/

    @GetMapping(path="/user")
    public List<UserDTO> getDetailsByAddress(@RequestParam String name){
        return userDetailsService.findByNameDerived(name);
    }
}
