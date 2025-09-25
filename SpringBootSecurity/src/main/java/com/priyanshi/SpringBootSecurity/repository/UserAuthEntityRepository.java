package com.priyanshi.SpringBootSecurity.repository;

import com.priyanshi.SpringBootSecurity.entity.UserAuthEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserAuthEntityRepository extends JpaRepository<UserAuthEntity,Long> {

    Optional<UserAuthEntity> findByUsername(String username);

}
