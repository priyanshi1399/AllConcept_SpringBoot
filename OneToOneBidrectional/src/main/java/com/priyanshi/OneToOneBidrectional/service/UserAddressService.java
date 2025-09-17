package com.priyanshi.OneToOneBidrectional.service;

import com.priyanshi.OneToOneBidrectional.entity.UserAddress;
import com.priyanshi.OneToOneBidrectional.entity.UserDetails;
import com.priyanshi.OneToOneBidrectional.repository.UserAddressRepository;
import com.priyanshi.OneToOneBidrectional.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAddressService {

    @Autowired
    UserAddressRepository userAddressRepository;



    public UserAddress findById(Long primaryKey){
        return userAddressRepository.findById(primaryKey).get();
    }

}
