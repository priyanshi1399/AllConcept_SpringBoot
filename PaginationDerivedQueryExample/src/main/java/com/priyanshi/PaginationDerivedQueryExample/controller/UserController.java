package com.priyanshi.PaginationDerivedQueryExample.controller;

import com.priyanshi.PaginationDerivedQueryExample.entity.UserDetails;
import com.priyanshi.PaginationDerivedQueryExample.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class UserController {

    @Autowired
    UserDetailsService userDetailsService;

    @PostMapping(path="/user/tryname_derived")
    public UserDetails userByName(@RequestBody UserDetails userDetails){
        return userDetailsService.saveUser(userDetails);
    }

    @GetMapping(path="/user/tryname_derivedA/{name}")
    public ResponseEntity<List<UserDetails>> getUserByName(@PathVariable String name,
                                                           @RequestParam(defaultValue="0") int page,
                                                           @RequestParam(defaultValue="5") int size){
        List<UserDetails> users=userDetailsService.findByNameDerived(name);
        return ResponseEntity.ok(users);
    }


}
