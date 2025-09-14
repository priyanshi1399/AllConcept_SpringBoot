package com.priyanshi.SpringbootMapDTO.service;

import com.priyanshi.SpringbootMapDTO.entity.UserDetails;
import com.priyanshi.SpringbootMapDTO.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;


    public UserDetails saveUser(UserDetails user){
        return userDetailsRepository.save(user);
    }

    public UserDetails findByID(Long primaryKey){
        return userDetailsRepository.findById(primaryKey).get();
    }


}
