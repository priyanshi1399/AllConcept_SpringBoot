package com.priyanshi.CustomInterceptorsAfterController;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;




@Component
public class User {

    @MyCustomAnnotation(name="user")
    public void getUser(){
        System.out.println("get the user details");
    }
}
