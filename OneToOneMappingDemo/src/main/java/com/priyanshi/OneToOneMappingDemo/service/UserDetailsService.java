package com.priyanshi.OneToOneMappingDemo.service;

import com.priyanshi.OneToOneMappingDemo.controller.repository.UserDetailsRepository;
import com.priyanshi.OneToOneMappingDemo.entity.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    public UserDetails saveUser(UserDetails user){
        return userDetailsRepository.save(user);
    }
}
