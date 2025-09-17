package com.priyanshi.OneToOneBidrectional.repository;

import com.priyanshi.OneToOneBidrectional.entity.UserAddress;
import com.priyanshi.OneToOneBidrectional.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAddressRepository extends JpaRepository< UserAddress,Long> {
}
