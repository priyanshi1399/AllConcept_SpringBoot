package com.priyanshi.NativeQueryExample.service;

import com.priyanshi.NativeQueryExample.entity.UserDetails;
import com.priyanshi.NativeQueryExample.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    public UserDetails saveUser(UserDetails user){
        return userDetailsRepository.save(user);
    }

    public List<UserDetails> getUserDetailsByName(String name){
        return userDetailsRepository.getUserDetailsByNameNativeQuery(name);
    }
}
