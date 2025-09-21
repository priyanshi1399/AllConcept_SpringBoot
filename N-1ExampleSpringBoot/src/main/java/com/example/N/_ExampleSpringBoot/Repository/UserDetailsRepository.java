package com.example.N._ExampleSpringBoot.Repository;

import com.example.N._ExampleSpringBoot.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {

    @Query("SELECT ud FROM UserDetails ud JOIN  ud.userAddressList ad where ud.name=:userFirstName")
    List<UserDetails> findUserDetailsWithAddress(@Param("userFirstName") String userName);
}
