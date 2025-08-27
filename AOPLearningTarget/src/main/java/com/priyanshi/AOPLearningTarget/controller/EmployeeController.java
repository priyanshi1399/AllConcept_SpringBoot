package com.priyanshi.AOPLearningTarget.controller;

import com.priyanshi.AOPLearningTarget.entity.IEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {


    @Autowired
    @Qualifier("tempEmployee")
    IEmployee empObj;

    @GetMapping(path="/fetchEmployee2")
    public String fetchEmployee(){
        empObj.fetchEmployeeMethod();
        return "fetch item";
    }
}
