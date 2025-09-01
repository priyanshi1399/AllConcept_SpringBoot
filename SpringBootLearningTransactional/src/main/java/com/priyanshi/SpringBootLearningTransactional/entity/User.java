package com.priyanshi.SpringBootLearningTransactional.entity;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Controller;

@Controller
public class User {


    @Transactional
    public void updateUser(){
        //System.out.println("run update query to update UserDB");
        throw new RuntimeException();
    }

}
