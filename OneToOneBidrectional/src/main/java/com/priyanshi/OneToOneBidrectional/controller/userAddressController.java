package com.priyanshi.OneToOneBidrectional.controller;

import com.priyanshi.OneToOneBidrectional.entity.UserAddress;
import com.priyanshi.OneToOneBidrectional.entity.UserDetails;
import com.priyanshi.OneToOneBidrectional.repository.UserAddressRepository;
import com.priyanshi.OneToOneBidrectional.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api")
public class userAddressController {

    @Autowired
    UserAddressService userAddressService;

    @GetMapping(path="/user-address/{id}")
    public UserAddress fetchUser(@PathVariable Long id){
        return userAddressService.findById(id);
    }


}
