package com.example.N._ExampleSpringBoot.service;

import com.example.N._ExampleSpringBoot.Repository.UserDetailsRepository;
import com.example.N._ExampleSpringBoot.entity.UserDetails;
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


    public List<UserDetails> findNameWithAddress(String name){
        return userDetailsRepository.findUserDetailsWithAddress(name);
    }
}
