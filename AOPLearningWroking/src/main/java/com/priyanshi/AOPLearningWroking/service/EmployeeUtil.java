package com.priyanshi.AOPLearningWroking.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeUtil {

    public void EmployeeHelperMethod(){
        System.out.println("inside helper method");
    }
}
