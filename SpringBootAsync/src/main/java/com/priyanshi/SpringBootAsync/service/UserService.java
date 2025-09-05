package com.priyanshi.SpringBootAsync.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Async
            //@Async("myThreadPoolExecutor")
    public void getUserObject(){
        System.out.println("Inside getUser Async Method "+Thread.currentThread().getName());
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
