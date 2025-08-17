package com.priyanshi.SpringBootConditionalOnProperty.Entity;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class DBConnection {


    @Autowired(required=false)
    SqlConnection sqlConnection;

    @Autowired(required=false)
    NoSqlConnection NoSqlConnection;

    @PostConstruct
    public void init(){
        System.out.println("DB Connection Bean Created with dependencies below");
        System.out.println("is sql Connection object null : " + Objects.isNull(sqlConnection));
        System.out.println("is Nosql Connection object null : " + Objects.isNull(NoSqlConnection));

    }




}
