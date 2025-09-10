package com.priyanshi.SpringBootJPAStarting.controller;

import com.priyanshi.SpringBootJPAStarting.PlainJDBCExample.DAO.UserDAO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping(path="/get-user-plain-jdbc")
    public String getUser(){
        try{
            UserDAO userdao=new UserDAO();
            userdao.createUserTable();
            userdao.createUser("x",25);
            userdao.createUser("y",26);


            userdao.readUsers();
            return "SUCCESS";
        }
        catch(Exception e){
            return "FAILED" +e.getMessage();
        }
    }

    @GetMapping(path="/get-user-spring-jdbc")
    public String getUserWithSpringJDBC(){
        try{
            //jdbc template
            return "Springbootjdbc implemetation";
        }
        catch(Exception e){
            e.printStackTrace();
            return "FAILED: "+e.getMessage();
        }
    }




}
