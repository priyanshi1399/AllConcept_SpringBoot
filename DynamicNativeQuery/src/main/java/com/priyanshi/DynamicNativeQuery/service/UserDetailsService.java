package com.priyanshi.DynamicNativeQuery.service;

import com.priyanshi.DynamicNativeQuery.DTO.UserDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsService {

    @PersistenceContext
    private EntityManager entityManager;

    public List<UserDTO> getUserDetailsByNameNativeQuery(String userName){
        StringBuilder  queryBuilder=new StringBuilder(
                "SELECT ud.user_name AS userName, ud.phone AS phone, ua.city AS city " +
                        "FROM user_details ud " +
                        "JOIN user_address ua ON ud.user_address_id=ua.id "+
                        "WHERE 1=1 "

        );

        List<Object> parameters=new ArrayList<>();

        if(userName!=null && !userName.isEmpty()){
            queryBuilder.append(" AND ud.user_name=?");
            parameters.add(userName);
        }

        Query query=entityManager.createNativeQuery(queryBuilder.toString());

        for(int i=0;i<parameters.size();i++){
            query.setParameter(i+1,parameters.get(i));
        }

        List<Object[]> results=query.getResultList();
        List<UserDTO> dtos=new ArrayList<>();

        for(Object[] row:results){
            String name=(String) row[0];
            String phone=(String) row[1];
            String city=(String) row[2];
            dtos.add(new UserDTO(name,phone,city));
        }

        return dtos;
    }
}
