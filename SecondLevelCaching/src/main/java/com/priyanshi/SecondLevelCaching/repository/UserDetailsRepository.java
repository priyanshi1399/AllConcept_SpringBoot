package com.priyanshi.SecondLevelCaching.repository;

import com.priyanshi.SecondLevelCaching.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PostMapping;

public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {

}


