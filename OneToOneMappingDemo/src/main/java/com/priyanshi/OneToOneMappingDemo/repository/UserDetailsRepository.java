package com.priyanshi.OneToOneMappingDemo.repository;

import com.priyanshi.OneToOneMappingDemo.entity.UserDetails;
import com.priyanshi.OneToOneMappingDemo.service.UserDetailsService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {
}
