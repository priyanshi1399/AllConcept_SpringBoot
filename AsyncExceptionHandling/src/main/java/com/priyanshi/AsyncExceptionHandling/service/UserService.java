package com.priyanshi.AsyncExceptionHandling.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserService {


    @Async
    public void performTaskAsync(){
        int i=0;
        System.out.println(5/i);
    }
}
