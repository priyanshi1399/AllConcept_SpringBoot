package com.priyanshi.AOPLearningStringArgs.entity;

import com.priyanshi.AOPLearningStringArgs.service.EmployeeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Employee {

    @Autowired
    EmployeeUtil employeeUtil;

    @GetMapping(path="/fetchEmployee")
    public String fetchEmployee(){
        employeeUtil.employeeHelperMethod("xyx",2);
        return "item fetched";
    }
}
