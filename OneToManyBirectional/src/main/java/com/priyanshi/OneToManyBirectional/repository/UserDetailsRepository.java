package com.priyanshi.OneToManyBirectional.repository;

import com.priyanshi.OneToManyBirectional.entity.UserDetails;
import com.priyanshi.OneToManyBirectional.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {
}
