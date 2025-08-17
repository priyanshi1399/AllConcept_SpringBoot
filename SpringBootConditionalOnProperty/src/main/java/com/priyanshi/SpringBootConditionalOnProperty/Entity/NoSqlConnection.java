package com.priyanshi.SpringBootConditionalOnProperty.Entity;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix="noSqlConnection",value= "enabled", havingValue="true",matchIfMissing=false)
public class NoSqlConnection {


     public NoSqlConnection(){
        System.out.println("Initilaization of Nosql Connection instance");
    }
}
