package com.priyanshi.DynamicNativeQuery.controller;


import com.priyanshi.DynamicNativeQuery.DTO.UserDTO;
import com.priyanshi.DynamicNativeQuery.entity.UserDetails;
import com.priyanshi.DynamicNativeQuery.service.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserDetailsController {

    private final UserDetailsService userDetailsService;

    public UserDetailsController(UserDetailsService userDetailsService) {
        this.userDetailsService=userDetailsService;
    }


    @GetMapping("/search")
    public List<UserDTO> searchByName(@RequestParam(required=false) String name){
        return userDetailsService.getUserDetailsByNameNativeQuery(name);
    }
}
