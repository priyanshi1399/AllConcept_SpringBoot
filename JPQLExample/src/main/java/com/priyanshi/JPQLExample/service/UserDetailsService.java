package com.priyanshi.JPQLExample.service;


import com.priyanshi.JPQLExample.entity.UserDetails;
import com.priyanshi.JPQLExample.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    public UserDetails saveUser(UserDetails userDetails){
        return userDetailsRepository.save(userDetails);
    }

    public List<UserDetails> getUserByAddress(String name){
        return userDetailsRepository.findUserDetailsWithAddress(name);
    }
}
