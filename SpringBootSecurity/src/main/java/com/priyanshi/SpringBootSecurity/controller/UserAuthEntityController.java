package com.priyanshi.SpringBootSecurity.controller;

import com.priyanshi.SpringBootSecurity.entity.UserAuthEntity;
import com.priyanshi.SpringBootSecurity.service.UserAuthEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserAuthEntityController {

    @Autowired
    private UserAuthEntityService userAuthEntityService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserAuthEntity userAuthDetails){
        //hash the password before saving
            userAuthDetails.setPassword(passwordEncoder.encode(userAuthDetails.getPassword()));

            userAuthEntityService.saveUser(userAuthDetails);
            return ResponseEntity.ok("User registered successfully!");
    }

}
