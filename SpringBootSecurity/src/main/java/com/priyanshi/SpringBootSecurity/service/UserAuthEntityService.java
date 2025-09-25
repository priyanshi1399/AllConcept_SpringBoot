package com.priyanshi.SpringBootSecurity.service;

import com.priyanshi.SpringBootSecurity.entity.UserAuthEntity;
import com.priyanshi.SpringBootSecurity.repository.UserAuthEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserAuthEntityService implements UserDetailsService {

        @Autowired
        private UserAuthEntityRepository userAuthEntityRepository;

        public UserAuthEntity saveUser(UserAuthEntity userAuthEntity){
            return userAuthEntityRepository.save(userAuthEntity);
        }
    @Override
    public UserAuthEntity loadUserByUsername(String username) throws UsernameNotFoundException {
       return userAuthEntityRepository.findByUsername(username)
               .orElseThrow(()->new UsernameNotFoundException("User not found"));
    }
}
