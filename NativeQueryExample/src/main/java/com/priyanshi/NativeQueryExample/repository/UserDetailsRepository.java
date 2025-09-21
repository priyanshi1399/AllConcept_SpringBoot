package com.priyanshi.NativeQueryExample.repository;

import com.priyanshi.NativeQueryExample.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {

    @Query(value="SELECT id,name FROM user_details WHERE name=:userFirstName",nativeQuery=true)
    List<UserDetails> getUserDetailsByNameNativeQuery(@Param("userFirstName") String userName);
}
