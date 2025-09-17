package com.priyanshi.OneToOneBidrectional.service;

import com.priyanshi.OneToOneBidrectional.entity.UserDetails;
import com.priyanshi.OneToOneBidrectional.repository.UserDetailsRepository;
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

