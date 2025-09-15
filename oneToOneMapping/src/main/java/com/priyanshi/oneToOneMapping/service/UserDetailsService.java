package com.priyanshi.oneToOneMapping.service;

import com.priyanshi.oneToOneMapping.entity.UserDetails;
import com.priyanshi.oneToOneMapping.repository.UserDetailsRepository;
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
