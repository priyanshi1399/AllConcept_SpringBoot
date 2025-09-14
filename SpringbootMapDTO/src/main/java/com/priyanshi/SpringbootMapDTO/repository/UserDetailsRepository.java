package com.priyanshi.SpringbootMapDTO.repository;

import com.priyanshi.SpringbootMapDTO.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {

}
