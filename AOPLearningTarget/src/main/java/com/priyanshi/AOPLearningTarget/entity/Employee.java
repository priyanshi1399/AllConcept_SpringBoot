package com.priyanshi.AOPLearningTarget.entity;

import com.priyanshi.AOPLearningTarget.service.EmployeeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class Employee {


    @Autowired
    EmployeeUtil employeeutil;

    @GetMapping(path="/fetchEmployee")
    public String fetchEmployee(){
        employeeutil.employeeHelperMethod();
        return "item fetched";
    }
}
