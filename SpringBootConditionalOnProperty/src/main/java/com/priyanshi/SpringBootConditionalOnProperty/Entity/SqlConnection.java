package com.priyanshi.SpringBootConditionalOnProperty.Entity;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix="sqlconnection",value="enabled",havingValue="true",matchIfMissing=false)
public class SqlConnection {


    public SqlConnection(){
        System.out.println("Initilaization of sql Connection instance");
    }
}
