package com.priyanshi.oneToOneMapping.service;

import com.priyanshi.oneToOneMapping.entity.UserDetails;
import com.priyanshi.oneToOneMapping.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    public UserDetails saveUser(UserDetails user){
        return userDetailsRepository.save(user);
    }

    public UserDetails updateUser(Long id,UserDetails user){
        Optional<UserDetails> existingUser=userDetailsRepository.findById(id);
        if(existingUser.isPresent()){
            return userDetailsRepository.save(user);
        }
        return null;

    }
}
