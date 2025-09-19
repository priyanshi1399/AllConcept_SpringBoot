package com.priyanshi.PaginationDerivedQueryExample.repository;

import com.priyanshi.PaginationDerivedQueryExample.entity.UserDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {

    Page<UserDetails> findUserDetailsByNameStartingWith(String userName, Pageable page);



}
