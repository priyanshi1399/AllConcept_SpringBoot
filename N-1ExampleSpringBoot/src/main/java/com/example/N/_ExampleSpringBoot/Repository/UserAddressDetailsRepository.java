package com.example.N._ExampleSpringBoot.Repository;

import com.example.N._ExampleSpringBoot.entity.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAddressDetailsRepository extends JpaRepository<UserAddress,Long> {
}
