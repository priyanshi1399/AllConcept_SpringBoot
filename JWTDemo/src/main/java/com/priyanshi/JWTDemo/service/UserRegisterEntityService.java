package com.priyanshi.JWTDemo.service;

import com.priyanshi.JWTDemo.entity.UserRegisterEntity;
import com.priyanshi.JWTDemo.repository.UserRegisterEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterEntityService implements UserDetailsService {

    @Autowired
    private UserRegisterEntityRepository userRegisterEntityRepository;

    public UserRegisterEntity saveUser(UserRegisterEntity userAuthEntity){
        return userRegisterEntityRepository.save(userAuthEntity);
    }
    @Override
    public UserRegisterEntity loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRegisterEntityRepository.findByUsername(username)
                .orElseThrow(()->new UsernameNotFoundException("User not found"));
    }
}

