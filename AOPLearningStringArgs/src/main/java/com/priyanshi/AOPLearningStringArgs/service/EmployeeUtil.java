package com.priyanshi.AOPLearningStringArgs.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeUtil {

    public void employeeHelperMethod(String str,int val){
        System.out.println("employee Helper method called");
    }
}
