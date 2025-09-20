package com.priyanshi.JPQLExample.service;


import com.priyanshi.JPQLExample.DTO.UserDTO;
import com.priyanshi.JPQLExample.entity.UserDetails;
import com.priyanshi.JPQLExample.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    public UserDetails saveUser(UserDetails userDetails) {
        return userDetailsRepository.save(userDetails);
    }

//    public List<UserDetails> getUserByAddress(String name){
//        return userDetailsRepository.findUserDetailsWithAddress(name);
//    }


    public List<UserDTO> findByNameDerived(String name) {
        List<Object[]> dbOutput = userDetailsRepository.findUserDetailsWithAddress(name);
        List<UserDTO> output = new ArrayList<>();
        for (Object[] val : dbOutput) {
            String userName = (String) val[0];
            String country = (String) val[1];
            UserDTO dto = new UserDTO(userName, country);
            output.add(dto);
        }
        return output;
    }
}
