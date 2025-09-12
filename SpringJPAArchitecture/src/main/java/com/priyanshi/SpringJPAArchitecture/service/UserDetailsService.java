package com.priyanshi.SpringJPAArchitecture.service;

import com.priyanshi.SpringJPAArchitecture.entity.UserDetails;
import com.priyanshi.SpringJPAArchitecture.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsService {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    public void saveUser(UserDetails user){
       userDetailsRepository.save(user);
    }

    public UserDetails findByID(Long primaryKey){
        return userDetailsRepository.findById(primaryKey).get();
    }
}
