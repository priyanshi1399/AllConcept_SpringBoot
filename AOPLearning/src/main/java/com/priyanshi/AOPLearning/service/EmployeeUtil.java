package com.priyanshi.AOPLearning.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeUtil {

    public void employeeHelperMethod(){
        System.out.println("employee helper method called");
    }
}
