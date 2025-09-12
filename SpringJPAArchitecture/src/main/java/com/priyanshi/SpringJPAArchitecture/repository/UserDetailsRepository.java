package com.priyanshi.SpringJPAArchitecture.repository;

import com.priyanshi.SpringJPAArchitecture.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {

    //our own query if we want to write
}
