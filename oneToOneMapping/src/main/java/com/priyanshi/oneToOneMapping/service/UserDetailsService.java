package com.priyanshi.oneToOneMapping.service;

import com.priyanshi.oneToOneMapping.entity.UserDetails;
import com.priyanshi.oneToOneMapping.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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

    public void deleteUser(Long userId){
        userDetailsRepository.deleteById(userId);
    }

    public UserDetails getUser( Long primaryKey){
        return userDetailsRepository.findById(primaryKey).get();
    }

    //for DTO One
    public UserDetails findByID(Long primaryKey){
        return userDetailsRepository.findById(primaryKey).get();
    }
}
