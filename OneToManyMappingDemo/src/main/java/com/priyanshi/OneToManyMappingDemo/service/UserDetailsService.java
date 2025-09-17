package com.priyanshi.OneToManyMappingDemo.service;

import com.priyanshi.OneToManyMappingDemo.entity.UserDetails;
import com.priyanshi.OneToManyMappingDemo.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {


    @Autowired
    UserDetailsRepository userDetailsRepository;

    public UserDetails saveUser(UserDetails userDetails) {
        return userDetailsRepository.save(userDetails);
    }

    public UserDetails findById(Long primaryKey){
        return userDetailsRepository.findById(primaryKey).get();
    }
}
