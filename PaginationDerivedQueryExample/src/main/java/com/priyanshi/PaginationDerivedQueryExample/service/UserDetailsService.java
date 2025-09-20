package com.priyanshi.PaginationDerivedQueryExample.service;

import com.priyanshi.PaginationDerivedQueryExample.entity.UserDetails;
import com.priyanshi.PaginationDerivedQueryExample.repository.UserDetailsRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    public UserDetails saveUser(UserDetails user){
        return  userDetailsRepository.save(user);
    }

//    public Page<UserDetails> findByNameDerived(String name,int page,int size){
//        Pageable pageable= PageRequest.of(page,size);
//        return userDetailsRepository.findUserDetailsByNameStartingWith(name,pageable);
//    }
//
    public List<UserDetails> findByNameDerived(String name){
        Pageable pageable=PageRequest.of(0,5,Sort.by("name").descending());
        Page<UserDetails> userDetailsPage=userDetailsRepository.findUserDetailsByNameStartingWith(name,pageable);
        List<UserDetails> userDetailsList=userDetailsPage.getContent();
        System.out.println("total page: "+userDetailsPage.getTotalPages());
        System.out.println("is first page"+userDetailsPage.getTotalPages());
        System.out.println("is Last Page"+userDetailsPage.isLast());
        return userDetailsList;
    }



}
